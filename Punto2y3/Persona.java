package Punto2y3;

import Punto5.Domicilio;
import Punto7.Computadora;

public class Persona 
{
	//Atributos privados.
	private String nombre;
	private String apellido;
	private int DNI;
	private Domicilio domicilio; //5B)
	private Computadora computadora; //7)
	private Persona pareja;
	
	
	//Constructor por defecto
	public Persona() 
	{
		nombre = "";
		apellido = "";
	}
	
	public Persona(String nombre, String apellido) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Constructor pedido por la CuentaBancaria en el punto 9.
	public Persona(String nombre, String apellido, int DNI) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
	}
	
	//Constructor usado para crear titulares de la cuenta bancaria. Punto9
	public Persona(String nombre, String apellido, int DNI, Domicilio domicilio) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.domicilio = domicilio;
	}
	
	//Setters
	public void ponerNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	public void setDomicilio(Domicilio domicilio) 
	{
		this.domicilio = domicilio;
	}
	
	public void setDni(int dni) 
	{
		this.DNI = dni;
	}
	
	public void setPareja(Persona pareja) 
	{
			this.pareja = pareja;	
	}
	
	//5C)
	//"Getter" sin return. Ya que en el caso de que sea null debemos devolver un mensaje debemos usar void ya que no podremos retornar un objeto Domicilio en ese caso.
	public void mostrarDomicilio() 
	{
		if(domicilio == null) 
		{
			System.out.println("No tiene domicilio");
		}
			System.out.println(domicilio);
	}
	
	public void trabajar() 
	{
		System.out.println("Trabajando..");
	}
	
	public void descansar() 
	{
		System.out.println("Descansando..");
	}
	
	//Getters
	public String obtenerNombreCompleto() 
	{
		return nombre + " " + apellido;
	}
	
	public int obtenerDNI() 
	{
		return DNI;
	}
	
	
	
	
	//To String
	@Override
	public String toString() {
		return "" + nombre + " " + apellido;
	}
	
}
