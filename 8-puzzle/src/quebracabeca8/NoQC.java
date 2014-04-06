package quebra_cabeca;


public class NoQC implements Comparable<NoQC>{
	private int[] estado;
	private NoQC pai = null;
	private int profundidade = 0;
	private double custo = 0.0;
	private int g = 0;
	
	public int[] getEstado() {
		return estado;
	}
	public void setEstado(int[] estado) {
		this.estado = estado;
	}
	public NoQC getPai() {
		return pai;
	}
	public void setPai(NoQC pai) {
		this.pai = pai;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}	
	
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public String toString(){
		String valor = "";
		for(int i = 0 ; i < estado.length; i++){
			if (i == (estado.length - 1))
				valor += estado[i];
			else
				valor += estado[i] + ", ";
		}		
		return "[ " + valor + " ]";
	}

	@Override
	public int compareTo(NoQC o) {
		if (this.g < o.getG()){
			return -1;
		}else{
			return 1;
		}		
	}

}
