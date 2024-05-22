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
    public int pedirNumero(String texto, int min, int max) {
       
    	System.out.println(texto);
    	
    	while(!(min < max )) 
    	{
    		System.out.println("El primer numero debe ser menor. Reintentalo");
    		min = scanner.nextInt();
    		max = scanner.nextInt();
    	}
    	
        // Generamos un número aleatorio entre min (inclusive) y max (inclusive)
        int numeroAleatorio = (int)(Math.random() * (max - min + 1)) + min;
        return numeroAleatorio;
    }
    
 // Método para pedir al usuario los límites y devolver un número aleatorio entre ellos, excluyendolos.
    public int pedirNumeroSinLimites(int min, int max) {
        if (min >= max - 1) 
        {
        	// Si no hay espacio para un número entre los límites, lanzamos una excepción
            throw new IllegalArgumentException("No hay números entre " + min + " y " + max);  
        }
        else 
        {
        	 int numeroAleatorio = (int)(Math.random() * (max - min - 1)) + min + 1; //num aleatorio excluyedo límites.
             return numeroAleatorio;
        }
        
       
    }
    
}
