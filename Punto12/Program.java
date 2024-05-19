package Punto12;

public class Program 
{
	public static void main(String[] args) 
	{
		Calculadora calculadora = new Calculadora();
		
		int a = 1;
		int b = 2;
		
		System.out.println(calculadora.sumar(a, b)); // 3
		System.out.println(calculadora.restar(a, b)); // -1
		System.out.println(calculadora.restar(b, a)); // 1
		System.out.println(calculadora.multiplicar(a, b)); //2
		System.out.println(calculadora.dividir(a, b)); // 0
		System.out.println(calculadora.dividir(b, a)); // 2
		calculadora.dividir(a, 0); //0
		calculadora.dividir(b, 0); // 0
		System.out.println(calculadora.dividir(0, a)); // 0
		System.out.println(calculadora.dividir(0, b)); //0
		
		
		
	}
}
