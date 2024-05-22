package Punto1;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		Ejercicio1 operaciones = new Ejercicio1();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame dos numeros, los sumaré");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("=");
		System.out.println(operaciones.sumar(a, b));
		
		System.out.println(); //Separación
		
		//Ingresar los límites para el segundo metodo.
		System.out.println("Ingrese el límite mínimo:");
        int min = scanner.nextInt();
        System.out.println("Ingrese el límite máximo:");
        int max = scanner.nextInt();

        // Llamamos al método para obtener un número aleatorio dentro de los límites dados y lo devolvemos.
        int numero = operaciones.pedirNumero("Generando un número aleatorio entre " + min + " y " + max, min, max);
        System.out.println("El número aleatorio generado es: " + numero);
        
        
        //METODO EXTRA. PROGRAMACIÓN LIBRE.
        System.out.println("Mismo ejercicio que recién pero excluyendo los límites. Llama a la función con los dos metodos.");
    	int numero2 = operaciones.pedirNumeroSinLimites(10, 15);
    	System.out.println("");
    	System.out.println("El número generado entre los límites brindados fue " + numero2); //Devuelve exitosamente lo pedido
        
        
	}
}
