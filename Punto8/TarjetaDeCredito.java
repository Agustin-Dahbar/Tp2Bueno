package Punto8;

public class TarjetaDeCredito 
{
	private String numero;
	private String titular;
	private double limite;
	private double acumuladoActual;
	
	//Constructor.
	public TarjetaDeCredito(String numero, String titular, int limite) 
	{
		this.numero = numero;
		this.titular = titular;
		this.limite = limite;
	}
	
	//Averiguamos si podemos gastar lo recibido o excede el límite.
	private boolean compraPosible(int monto) 
	{
		if(monto > limite) 
		{
			return false;
		}
		else 
		{
			this.acumuladoActual += monto;
			return true;
		}
	}
	
	//Metodo para sumar lo gastado hasta ahora
	private void acumularGastoActual(int gasto) 
	{
		this.acumuladoActual += gasto;
	}
	
	//Metodos averiguamos nuestro saldo disponible.
	public double montoDisponible()
	{
		if(acumuladoActual > limite) 
		{
			double montoDisponible = 0;
			return montoDisponible;
		}
		
		double montoDisponible = this.limite - this.acumuladoActual;
		return montoDisponible;
	}	
	
	//Metodo para averiguar si se puede realizar la compra
	public boolean realizarCompra(int monto) 
	{
		if(compraPosible(monto))  //Usamos el metodo booleano que declaramos anteriormente que utiliza la misma lógica pedida en este caso.
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//Actualizamos el limite
	public void actualizarLimite(int nuevoLimite) //Lo mismo que el setter creado anteriormente. (Línea 82)
	{
		this.limite = nuevoLimite;
	}
	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limite=" + limite
				+ ", acumuladoActual=" + montoDisponible() + "]";
	}

	//Getters
	public String getNumero()
	{
		return numero;
	}
	
	public String getTitular() 
	{
		return titular;
	}
	
	public double getLimite() 
	{
		return limite;
	}
	
	public double getAcumuladoActual() 
	{
		return acumuladoActual;
	}
	
	//Setters
	
	public void setNumero(String numero) 
	{
		this.numero = numero;
	}
	
	public void setTitulat(String titular) 
	{
		this.titular = titular;
	}
	
	public void setLimite(int limite) 
	{
		this.limite = limite;
	}
}
