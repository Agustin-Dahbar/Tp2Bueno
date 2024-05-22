package Punto8;

public class Test 
{
	
	public static void main(String[] args) 
	{
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez", 10000);
		
		System.out.println(tarjeta.realizarCompra(4000)); //true
		System.out.println(tarjeta);
		
		tarjeta.actualizarLimite(3000);
		System.out.println(tarjeta.realizarCompra(4000)); //false
		System.out.println(tarjeta);
		
	}
	
}
