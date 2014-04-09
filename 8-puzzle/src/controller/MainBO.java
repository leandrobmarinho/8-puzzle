package controller;

import java.awt.Color;
import java.util.Stack;
import javax.swing.DefaultListModel;
import quebracabeca8.BuscaQC;
import quebracabeca8.NoQC;
import quebracabeca8.ProblemaQC;
import view.QCJFrame;

/**
 *
 * @author leandro
 */
public class MainBO {

    public QCJFrame view;
    public int[] estadoAtual;
    public ProblemaQC problema;
    public BuscaQC busca;
    public Stack<NoQC> solucao;
    private Color sucess = new Color(75, 165, 66);
    private Color error = new Color(255, 165, 0);
    private Color alert = new Color(255, 140, 0);

    public MainBO(QCJFrame view) {
        this.view = view;
        estadoAtual = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        this.problema = new ProblemaQC();
        this.problema.setEstadoInicial(estadoAtual);
        this.busca = new BuscaQC(problema);
    }

    public void alteraEstado(int botao) {

        if (view.UP == botao) {
            for (int pos = 0; pos < estadoAtual.length; pos++) {
                if ((pos != 0) && (pos != 1) && (pos != 2)) {
                    if ((estadoAtual[pos - 3] == 0)) {

                        view.getTecla(pos - 3).setText(estadoAtual[pos] + "");
                        view.getTecla(pos).setText("");

                        estadoAtual[pos - 3] = estadoAtual[pos];
                        estadoAtual[pos] = 0;
                        break;
                    }
                }
            }
        }

        if (view.DOWN == botao) {
            for (int pos = 0; pos < estadoAtual.length; pos++) {
                if ((pos != 6) && (pos != 7) && (pos != 8)) {
                    if ((estadoAtual[pos + 3] == 0)) {

                        view.getTecla(pos + 3).setText(estadoAtual[pos] + "");
                        view.getTecla(pos).setText("");

                        estadoAtual[pos + 3] = estadoAtual[pos];
                        estadoAtual[pos] = 0;
                        break;
                    }
                }
            }
        }

        if (view.RIGHT == botao) {
            for (int pos = 0; pos < estadoAtual.length; pos++) {
                if ((pos != 2) && (pos != 5) && (pos != 8)) {
                    if ((estadoAtual[pos + 1] == 0)) {

                        view.getTecla(pos + 1).setText(estadoAtual[pos] + "");
                        view.getTecla(pos).setText("");

                        estadoAtual[pos + 1] = estadoAtual[pos];
                        estadoAtual[pos] = 0;
                        break;
                    }
                }
            }
        }

        if (view.LEFT == botao) {
            for (int pos = 0; pos < estadoAtual.length; pos++) {
                if ((pos != 0) && (pos != 3) && (pos != 6)) {
                    if ((estadoAtual[pos - 1] == 0)) {

                        view.getTecla(pos - 1).setText(estadoAtual[pos] + "");
                        view.getTecla(pos).setText("");

                        estadoAtual[pos - 1] = estadoAtual[pos];
                        estadoAtual[pos] = 0;
                        break;
                    }
                }
            }
        }
        imprimeEstado();
    }

    private void imprimeEstado() {
        String estado = "";
        for (int i = 0; i < estadoAtual.length; i++) {
            if (i == estadoAtual.length - 1) {
                estado += estadoAtual[i];
            } else {
                estado += estadoAtual[i] + ", ";
            }
        }

        System.out.println("[ " + estado + " ] - Estado Atual");
    }

    public void resolve(String busca) {
        this.problema.setEstadoInicial(this.estadoAtual);

        long ti = 0, tf = 0;
        solucao = null;
        if ("Largura".equals(busca)) {
            System.out.println("== Busca em largura==");
            ti = System.currentTimeMillis();
            solucao = this.busca.emLargura();
            tf = System.currentTimeMillis();
        } else if ("Profundidade".equals(busca)) {
            System.out.println("== Busca em Profundidade==");
            ti = System.currentTimeMillis();
            solucao = this.busca.emProfundidade();
            tf = System.currentTimeMillis();
        } else if ("A*".equals(busca)) {
            System.out.println("== Busca A*==");
            ti = System.currentTimeMillis();
            solucao = this.busca.A_Asterisco();
            tf = System.currentTimeMillis();
        } else if ("Gulosa".equals(busca)) {
            System.out.println("== Busca Gulosa==");
            ti = System.currentTimeMillis();
            solucao = this.busca.gulosa();
            tf = System.currentTimeMillis();
        }

        this.view.getLabelMensagem().setText("");
        if (solucao != null) {
            //solucao.pop();
            System.out.println(solucao.size());
            this.view.getLabelNumPasso().setText((solucao.size() - 1) + "");
            this.view.getLabelTempo().setText((tf - ti) + "");
            imprimeCaminho((Stack<NoQC>) solucao.clone());

            if (this.problema.isObjetivo(solucao.pop().getEstado())) {
                this.view.getLabelMensagem().setForeground(sucess);
                this.view.getLabelMensagem().setText("Sucesso!");
            }
            
        }else{
            this.view.getLabelMensagem().setForeground(error);
            this.view.getLabelMensagem().setText("Erro!");            
        }
    }

    public void imprimeCaminho(Stack<NoQC> caminho) {
        if (caminho == null) {
            System.out.println("Caminho não encontrado");
            return;
        }

        DefaultListModel lista = new DefaultListModel();
        NoQC no;
        int quantidade = caminho.size();
        do {
            no = caminho.pop();
            System.out.println(no);
            lista.addElement(no.toString());

        } while (!caminho.isEmpty());
        view.getLista().setModel(lista);
        System.out.println("Número de passos: " + quantidade);
    }

    public void acao() {
        if (solucao != null && !solucao.isEmpty()) {

            NoQC no = solucao.pop();
            System.out.println(no);
            String valor;
            for (int pos = 0; pos < 9; pos++) {

                valor = (no.getEstado()[pos] == 0) ? "" : (no.getEstado()[pos] + "");

                view.getTecla(pos).setText(valor);

                estadoAtual[pos] = no.getEstado()[pos];
            }
            this.view.getPassoLabel().setText(solucao.size() + "");

            if (this.problema.isObjetivo(this.estadoAtual)) {
                this.view.getLabelMensagem().setForeground(sucess);
                this.view.getLabelMensagem().setText("Sucesso!");
            }
        }
    }

    public void resetar() {

        String valor;

        for (int pos = 0; pos < 9; pos++) {
            valor = (pos == 0) ? "" : (pos + "");
            view.getTecla(pos).setText(valor);
            estadoAtual[pos] = pos;
        }

        limpar();
    }
    
    public void limpar(){
        this.view.getLabelMensagem().setText("");
        this.view.getLabelTempo().setText("");
        this.view.getLabelNumPasso().setText("");
        this.view.getPassoLabel().setText("");
        this.view.getLista().setModel(new DefaultListModel());
        this.view.getBotaoStep().setEnabled(false);
        this.view.getBotaoPlay().setEnabled(false);
    }
}
