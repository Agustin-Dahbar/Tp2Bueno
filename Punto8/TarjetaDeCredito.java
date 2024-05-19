package Punto8;

public class TarjetaDeCredito 
{
	private String numero;
	private String titular;
	private int limite;
	private int acumuladoActual;
	
	public TarjetaDeCredito(String numero, String titular, int limite) 
	{
		this.numero = numero;
		this.titular = titular;
		this.limite = limite;
	}
	
	//Metodos averiguamos nuestro saldo disponible.
	public int montoDisponible()
	{
		if(acumuladoActual > limite) 
		{
			int montoDisponible = 0;
			return montoDisponible;
		}
		
		int montoDisponible = this.limite - this.acumuladoActual;
		return montoDisponible;
	}
	
	//Averiguamos si podemos gastar lo recibido o excede el limite
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
	
	//Actualizamos el limite
	public void actualizarLimite(int nuevoLimite) //Lo mismo que el setter creado anteriormente. (Línea 82)
	{
		this.limite = nuevoLimite;
	}
	
	//Metodo para sumar lo gastado hasta ahora
	private void acumularGastoActual(int gasto) 
	{
		acumuladoActual += gasto;
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
	
	public int getLimite() 
	{
		return limite;
	}
	
	public int getAcumuladoActual() 
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
