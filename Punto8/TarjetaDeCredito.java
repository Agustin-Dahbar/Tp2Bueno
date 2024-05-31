package Punto8;

public class TarjetaDeCredito 
{
	private String numero;
	private String titular;
	private double limite;
	private double acumuladoActual;
	
	//Constructor.
	public TarjetaDeCredito(String numero, String titular, double limite) 
	{
		this.numero = numero;
		this.titular = titular;
		this.limite = limite;
	}
	
	//Averiguamos si podemos gastar lo recibido o excede el límite.
	private boolean compraPosible(int monto) 
    {
        if(this.acumuladoActual + monto <= limite) 
        {
        	return true;
        }
        
        return false;
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
			acumularGastoActual(monto); //Actualizamos los atributos que debemos actualizar al realizar la compra.
			return true;
		}

			return false;
	}
	
	//Actualizamos el limite
	public void actualizarLimite(int nuevoLimite) //Lo mismo que el setter creado anteriormente. (Línea 82)
	{
		this.limite = nuevoLimite;
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
	
	private void setNumero(String numero) 
	{
		this.numero = numero;
	}
	
	private void setTitular(String titular) 
	{
		this.titular = titular;
	}
	
	private void setLimite(int limite) 
	{
		this.limite = limite;
	}
	
	//ToString
	@Override
	public String toString() {
		return "TarjetaDeCredito [Numero = " + this.numero + ", Titular = " + this.titular + ", Limite = " + this.limite
				+ ", Monto disponible = " + this.montoDisponible() + " Acumulado actual = " + this.acumuladoActual + "]";
	}
}
