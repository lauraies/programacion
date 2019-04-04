public class Juego{
	
	public static void main(String [] args){
		Dado midado = new Dado();
		int valor = midado.tirar();
		System.out.println("El primer jugador ha sacado un" + valor);
		int valor2 = midado.tirar();
		System.out.println("El segundo jugador ha sacado un" + valor2);
		
		System.out.println("Ha ganado "+(valor>valor2?
									"el primer jugador":"el segundo jugador"));
		
	}
	
	
}