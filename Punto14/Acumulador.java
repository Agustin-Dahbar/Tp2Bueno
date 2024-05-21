package Punto14;

public class Acumulador 
{
	private int valor;
	
	//Acumulador de las notas para que luego se dividan por el contador que será el divisor..
	public void incrementarValor(int valor) 
	{
		this.valor += valor;
	}
	
	public int obtenerValor() 
	{
		return this.valor;
	}
	
}
