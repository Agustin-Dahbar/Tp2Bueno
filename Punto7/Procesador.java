package Punto7;

public class Procesador 
{
	private String marca;
	private int modelo;
	private int nivelTemperatura;
	
	public void nivelTemperaturaCritica() 
	{
		if(this.nivelTemperatura > 96) 
		{
			System.out.println("Nivel temperatura crítica de la CPU.");
		}
		
		System.out.println("Nivel de temperatura aceptable.");
	}
}
