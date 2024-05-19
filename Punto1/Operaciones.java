package Punto1;

import java.util.Scanner;

public class Operaciones 
{
	Scanner scanner = new Scanner(System.in);
	
	//Metodo que suma dos números indicados por el usuario.
	public int sumar(int a, int b) 
	{	
		return a + b;
	}
	
	//Metodo que imprime una instrucción y luego pide dos números que serán los límites para la final selección de un número comprendido entre elllos
	public int pedirNumero(String texto, int a, int b) 
	{
		System.out.println(texto); //Instrucción que se designará al llamar al metodo. Pedirá el número comprendido.
		
		int numero = scanner.nextInt();
		
		while(!(numero > a && numero < b)) //Validamos que el número este comprendido entre los indicados. 
		{
			System.out.println("El número debe estar comprendido entre los límites que indicaste. Reintentalo.");
			numero = scanner.nextInt();
		}
		
		return numero; //Si lo esta lo devolvemos.
	}
}
