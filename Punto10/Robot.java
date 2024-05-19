package Punto10;

import Punto2y3.Persona;

public class Robot 
{
	private String nombre;
	
	public Robot(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void saludar() 
	{
		System.out.println("Hola mi nombre es " + nombre + " ¿En que puedo ayudarte?" );
	}
	
	public void saludarPersona(Persona persona) 
	{
		System.out.println("Hola " + persona + " mi nombre es " + nombre + "¿En que puedo ayudarte?" );
	}
	
}
