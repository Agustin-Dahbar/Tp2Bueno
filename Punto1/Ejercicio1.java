package Punto1;

import java.util.Scanner;

public class Ejercicio1 
{
	Scanner scanner = new Scanner(System.in);
	
	//Metodo que suma dos números indicados por el usuario.
	public int sumar(int a, int b) 
	{	
		return a + b;
	}
	
	// Método para pedir al usuario los límites y devolver un número aleatorio entre ellos
    public int pedirNumero(String texto, int num1, int num2) 
    {
    	System.out.println(texto);
    	
        // Generamos un número aleatorio entre min (inclusive) y max (inclusive)
        int numeroAleatorio = (int)(Math.random() * (num1 - num2 + 1)) + num1;
        
        return numeroAleatorio;
    }
    
}
