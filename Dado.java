
public class Dado {
	private int valor;
	
	public Dado(){
		;
	}
	public int tirarDado(){
		//Este método dará un valor aleatorio al dado entre 1 y 6.
		this.valor=(int)((Math.random()*6)+1);
		return this.valor;
	}
	
	public int getValor(){
		return this.valor;
	}
}