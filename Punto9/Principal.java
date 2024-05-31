package Punto9;
import Punto2y3.Persona;
import Punto5.Domicilio;

public class Principal 
{
	public static void main(String[] args) 
	{
		Domicilio domicilioPareja = new Domicilio("Yatay", 240, "Almagro");
		
		Persona fulano = new Persona("Fulano", "Gomez", 12345678, domicilioPareja);
		Persona mengana = new Persona("Mengana", "Torres", 9123456, domicilioPareja);
		
		//fulano.setPareja(mengana); 
		//mengana.setPareja(fulano);
	
		
		CuentaBancaria cuentaFulano = new CuentaBancaria(TipoCuenta.CAJA_AHORRO, 10000, fulano);
		
		CuentaBancaria cuentaMengana = new CuentaBancaria(TipoCuenta.CUENTA_CORRIENTE, 10000, mengana);		
		System.out.println(cuentaFulano);
		System.out.println(cuentaMengana);
	}
}
