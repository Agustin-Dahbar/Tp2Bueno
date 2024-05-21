package Punto14;

public class Promedio 
{
	private  Acumulador acumulador;
	private Contador contador;
	
	public Promedio(Acumulador acumulador, Contador contador) 
	{
		this.acumulador = acumulador;
		this.contador = contador;
	}

	//Incremetamos el valor de los atributos para poder sacar el promedio y obtener el valor de la clase actual.
	public void incrementar(int valor) 
	{
		this.acumulador.incrementarValor(valor);
		this.contador.incrementarValor();
	}
	
	//Obtenemos el valor del promedio.
	public double obtenerValor() 
	{
		if(this.contador.obtenerValor() == 0) //Si el contador es 0 (nunca se ejecutó el metodo anterior y se empezó por este)
		{
			return 0;
		}
		else //Si no obtenemos el promedio.
		{
			return (double)  this.acumulador.obtenerValor() / this.contador.obtenerValor();
		}
	}
}
