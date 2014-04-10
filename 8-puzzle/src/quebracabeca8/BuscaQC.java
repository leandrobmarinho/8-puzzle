package quebracabeca8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BuscaQC {

    private ProblemaQC problema;
    private List<int[]> visitados;
    private int limiteProfundidade = 22;
    private final int LARG = 0;
    private final int PROF = 1;
    private final int limitePROF = 25;
    private final int limiteLARG = 18;

    public BuscaQC(ProblemaQC problema) {
        this.problema = problema;
    }

    public Stack<NoQC> emLargura() {
        this.visitados = new ArrayList<>();
        Queue<NoQC> fila = new LinkedList<>();

        NoQC no = new NoQC();
        no.setEstado(problema.getEstadoInicial());
        fila.add(no);

        while (!fila.isEmpty()) {
            System.out.println(fila.size() + " Size fila");
            no = fila.poll();

            if (problema.isObjetivo(no.getEstado())) {
                return solucao(no);
            }

            fila.addAll(expandir(no, LARG));
        }

        return null;
    }

    public Stack<NoQC> emProfundidade() {
        this.visitados = new ArrayList<>();
        Stack<NoQC> pilha = new Stack<>();

        NoQC no = new NoQC();
        no.setEstado(problema.getEstadoInicial());
        pilha.push(no);

        while (!pilha.isEmpty()) {

            no = pilha.pop();

            if (problema.isObjetivo(no.getEstado())) {
                return solucao(no);
            }

            pilha.addAll(expandir(no, PROF));
        }

        return null;
    }

    public Stack<NoQC> gulosa() {
        this.visitados = new ArrayList<>();
        Stack<NoQC> pilha = new Stack<>();

        NoQC no = new NoQC();
        no.setEstado(problema.getEstadoInicial());
        pilha.push(no);

        while (!pilha.isEmpty()) {

            no = pilha.pop();

            if (problema.isObjetivo(no.getEstado())) {
                return solucao(no);
            }

            pilha.addAll(expandirGulosa(no));
        }

        return null;
    }

    public Stack<NoQC> A_Asterisco() {
        this.visitados = new ArrayList<>();
        List<NoQC> borda = new ArrayList<>();

        NoQC no = new NoQC();
        no.setEstado(problema.getEstadoInicial());
        borda.add(no);

        while (!borda.isEmpty()) {

            no = borda.remove(0);

            if (problema.isObjetivo(no.getEstado())) {
                return solucao(no);
            }

            borda.addAll(expandirAsterico(no));
            Collections.sort(borda);
        }

        return null;
    }

    private List<NoQC> expandirAsterico(NoQC no) {
        List<NoQC> sucessores = new ArrayList<>();

        // imprimirArvore(no);
        this.visitados.add(no.getEstado());

        for (int[] sucessor : problema.getSucerrores(no.getEstado()).get(no.getEstado())) {

            if (!foiVisitado(sucessor)) {

                NoQC novo = new NoQC();
                novo.setEstado(sucessor);
                novo.setPai(no);
                novo.setProfundidade((no.getProfundidade() + 1));
                novo.setCusto(no.getCusto() + 1);

                //f(n) = h(n) + g(n)
                novo.setComparador( numblocosPosicaoErrada(sucessor) + ( no.getCusto() + 1 ) );//criterio para ordenar

                sucessores.add(novo);
            }
        }
        return sucessores;
    }

    private List<NoQC> expandirGulosa(NoQC no) {
        List<NoQC> sucessores = new ArrayList<>();

        // imprimirArvore(no);
        this.visitados.add(no.getEstado());

        for (int[] sucessor : problema.getSucerrores(no.getEstado()).get(no.getEstado())) {

            if (!foiVisitado(sucessor)) {

                NoQC novo = new NoQC();
                novo.setEstado(sucessor);
                novo.setPai(no);
                novo.setProfundidade((no.getProfundidade() + 1));
                novo.setComparador(numblocosPosicaoErrada(sucessor));//criterio para ordenar

                sucessores.add(novo);
            }
        }
        Collections.sort(sucessores, Collections.reverseOrder());
        return sucessores;
    }

    private List<NoQC> expandir(NoQC no, int tipo) {
        List<NoQC> sucessores = new ArrayList<>();

        // imprimirArvore(no);
        this.visitados.add(no.getEstado());
        System.out.println(no.getProfundidade() + " PROF.");

        if ( (no.getProfundidade() <= limitePROF && tipo == PROF ) || 
                (no.getProfundidade() <= limiteLARG && tipo == LARG ) ) {

            for (int[] sucessor : problema.getSucerrores(no.getEstado()).get(no.getEstado())) {

                if (!foiVisitado(sucessor)) {

                    NoQC novo = new NoQC();
                    novo.setEstado(sucessor);
                    novo.setPai(no);
                    novo.setProfundidade((no.getProfundidade() + 1));

                    sucessores.add(novo);
                }
            }
            Collections.shuffle(sucessores);
        }
        return sucessores;
    }

    private Stack<NoQC> solucao(NoQC no) {
        Stack<NoQC> caminho = new Stack<>();
        caminho.add(no);

        NoQC pai = no.getPai();
        while (pai != null) {
            caminho.push(pai);
            pai = pai.getPai();
        }

        return caminho;
    }    
    
    //heuristica
    private int numblocosPosicaoErrada(int[] estado) {
        int soma = 0;
        int[] objetivo = this.problema.getEstadoFinal();

        for (int pos = 0; pos < estado.length; pos++) {
            if (objetivo[pos] != estado[pos]) {
                soma++;
            }
        }
        return soma;
    }

    private boolean foiVisitado(int[] estado) {
        if (this.visitados.isEmpty()) {
            return false;
        }

        for (int[] visitado : this.visitados) {

            if (igual(visitado, estado)) {
                return true;
            }
        }

        return false;
    }

    private boolean igual(int[] ob1, int[] ob2) {

        for (int pos = 0; pos < ob1.length; pos++) {

            if (ob1[pos] != ob2[pos]) {
                return false;
            }
        }

        return true;
    }
}
