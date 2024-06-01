package Punto1;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		Ejercicio1 operaciones = new Ejercicio1();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame dos numeros, los sumare");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("=");
		System.out.println(operaciones.sumar(a, b));
		
		System.out.println(); //Separación
		
		//Ingresar los límites para el segundo metodo.
		System.out.println("Ingrese el límite minimo:");
        int min = scanner.nextInt();
        
        System.out.println("Ingrese el límite maximo:");
        int max = scanner.nextInt();

        // Imprimimos el llamado al método para obtener un número aleatorio dentro de los límites dados.
        System.out.println(operaciones.pedirNumero("Validando los limites...", min, max));
	}
}
