package Punto7;

public class Computadora 
{
	//Atributos
	private String marca;
	private TipoComputadora tipo;
	private Procesador procesador;
	private LectoraDVD lectora;
	
	
	//Metodos
	public void prender() 
	{
		System.out.println("Prendiendo.");
	}
	
	public void apagar() 
	{
		System.out.println("Apagando..");
	}
	
	public void reiniciando() 
	{
		System.out.println("Reiniciando..");
	}
}
