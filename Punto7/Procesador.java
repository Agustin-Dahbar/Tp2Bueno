package Punto7;

public class Procesador 
{
	private String marca;
	private int modelo;
	private int nivelTemperatura;
	
	public void nivelTemperaturaCritica(int nivelTemperatura) 
	{
		if(nivelTemperatura > 96) 
		{
			System.out.println("Nivel temperatura crítica de la CPU.");
		}
	}
}
