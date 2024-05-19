package Punto10;
import Punto2y3.Persona;

public class Principal 
{
	public static void main(String[] args) 
	{
		Robot walle = new Robot("Walle");
		Persona agustin = new Persona("Agustin", "Dahbar");
		
		walle.saludar();
		walle.saludarPersona(agustin);
	}
}
