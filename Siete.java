public class Siete{
	private Dado d1, d2;
	public void jugar(){
		d1.tirar();
		d2.tirar();
		if (d1.getValor()+ d2.getValor() == 7){
			System.out.println("Ha ganado");
		}else {
			System.out.println("Ha perdido");
		}
			
	}
}