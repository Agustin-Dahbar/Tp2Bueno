package Punto14;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		Acumulador acumulador = new Acumulador();
		Contador contador = new Contador();
		Promedio promedio = new Promedio(acumulador, contador);
		
		int nota = 0; //Nota ingresada del examen.
		
		System.out.println("Ingresa las notas del primer parcial. Sacaré el promedio, cuando quieras acabar dale a -1.");
		
		while(nota != -1) 
		{
			System.out.println("Nota:");
			nota = scanner.nextInt(); //Pedimos el ingreso de la nota (dentro del while para que se repita en caso de no ser entre 0 y 10.
			
			if(nota >= 0 && nota <= 10) //Si la nota esta entre 0 y 10 aumentamos los valores de los atributos de promedio, es decir
				// del contador y el acumulador. 1 valor para el contador y el valor de la nota ingresada para el acumualador
			{
				promedio.incrementar(nota);
			}
			else if(nota != -1) //Con esta condición evitamos esta impresión innecesaria al cancelar el programa con un -1.
			{
				System.out.println("Valor incorrecto. Entre 0 y 10. Reingresalo.");
			}
		}
		//Una vez salidos del while significa que se ingreso -1.
		double promedioFinal = promedio.obtenerValor();
		
		System.out.println("El promedio es " + promedioFinal);
	}
}
