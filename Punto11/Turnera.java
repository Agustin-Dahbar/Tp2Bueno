package Punto11;

public class Turnera 
{
	private int valor;
	
	//Constructor por defecto.
	public Turnera() 
	{
		this.valor = 0;
	}

	//Aumenta un valor al atributo
	public void otorgarProximoNumero() 
	{
		this.valor++;
	}
	
	//Settea el atributo siempre en 0.
	public void resetearContador() 
	{
		this.valor = 0;
	}
	
	//Setter del atributo. Da el valor argumentado en caso de que sea mayor o igual a 0.
	public void resetearContador(int valor) 
	{
		if(valor >= 0) 
		{
			this.valor = valor;
		}
	}
	
	//Getter del atributo
	public int obtenerUltimoNumeroOtorgado() 
	{
		return this.valor;
	}
	
	
	
	//ToString
	@Override
	public String toString() 
	{
		return "" + valor + "";
	}
}
