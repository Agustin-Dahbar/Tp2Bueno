package Punto1;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		Operaciones operaciones = new Operaciones();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame dos numeros, los sumaré");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("=");
		System.out.println(operaciones.sumar(a, b));
		
		System.out.println(); //Separación
		

		//Instrucción para el siguiente metodo
		System.out.println("Indica mediante dos números límites para una amplia selección de números.");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		//Indicamos que el primer numero debe ser menor para que sea posible el programa.
		while(a >= b) 
		{
			System.out.println("El primer número debe ser menor al segundo. Reintentalo.");
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
		
		int numero = operaciones.pedirNumero("Ahora selecciona un número comprendido entre dicho límite.", a, b);
		
		//Devolvemos el número seleccionado.
		System.out.println("El número seleccionado fue " + numero);
	}
}
