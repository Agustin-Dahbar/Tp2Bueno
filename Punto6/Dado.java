package Punto6;

import java.util.Random;

public class Dado 
{
	private int valor;
	
	//Constructores
	public Dado() 
	{
		this.valor = 1;
	}
	
	public Dado(int valor) 
	{
		if(valor >= 1 && valor <=6) //Evaluamos si el dado se construyo con un valor correcto (entre 1 y 6)
		{
			this.valor = valor;
		}
		
		this.valor = 1; //Si no se indica un numero correcto, lo setteamos en 1.
		
	}
	
	//Metodo para obtener el valor
	public int getValor() 
	{
		return valor;
	}
	
	//Metodo que lanza el dado y le generá un valor aleatorio.
	public int lanzar() 
	{
		this.valor = (int)(Math.random() * 6 + 1); 
		return this.valor;
	}
}


