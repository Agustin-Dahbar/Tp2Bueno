package Punto11;

public class Program 
{
	public static void main(String[] args) 
	{
		//Aunque no se pida probamos que funcione nuestra clase (seguro lo hará)
		
		Turnera turnera = new Turnera(); //Instancia de clase
		
		turnera.otorgarProximoNumero();
		System.out.println(turnera); // 1
		
		turnera.resetearContador(15);
		System.out.println(turnera); // 15

		turnera.resetearContador();
		System.out.println(turnera); // 0
		
		turnera.resetearContador(21); // 21
		System.out.println(turnera);
		
		System.out.println(turnera.obtenerUltimoNumeroOtorgado()); // 21
		
		//Efectivamente, lo hizó..
	}
}
