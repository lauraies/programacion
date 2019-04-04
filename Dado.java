
public class Dado {
	private Integer valor;
	
	public Dado(){
		valor = tirarDado();
	}
	public Integer tirarDado(){
		//Este método dará un valor aleatorio al dado entre 1 y 6.
		this.valor=(Integer)((Math.random()*6)+1);
		return this.valor;
	}
	
	public int getValor(){
		return this.valor;
	}
}