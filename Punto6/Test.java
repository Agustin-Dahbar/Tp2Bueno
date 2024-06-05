package Punto6;

public class Test{

	public static void main(String[] args) {

	//Creamos los dados
	Dado dadoUno = new Dado();
	Dado dadoDos = new Dado();
	
	//Los lanzamos y almacenamos los resultados en dos variables.
	int valorUno = dadoUno.lanzar();
	int valorDos = dadoDos.lanzar();
	
	System.out.println(valorUno);
	System.out.println(valorDos);
	
	//Evaluamos cual cayó con un valor mayor o si coincidieron.
	if(valorUno == valorDos) 
	{
		System.out.println("Los dados tuvieron el mismo valor (" + valorUno + ").");
	}
	else if(valorUno > valorDos)
	{
		System.out.println("El mayor valor fue " + valorUno);
	}
	else 
	{
		System.out.println("El mayor valor fue " + valorDos);
	}

		

	
	
	
	////Realizamos 100 lanzamientos con el dado uno.
	int sumaTotal = 0; //Acumulador
	
	for(int i = 0; i < 100; i++) // 0 < 100 (significa que se haran 100 iteraciones. Es lo mismo que 1 <= 100 
	{
		int valor = dadoUno.lanzar(); //Almacenamos el valor del primer lanzamiento.
		sumaTotal += valor; //Acumulamos el valor del primer lanzamiento. 
		//Repetimos 99 veces más.
	}
	
	double promedioUno = sumaTotal / 100.0; //Promedio de los 100 lanzamientos del primer dado diviendo su acumulador en 100.0
	
	System.out.println("El promedio del dado uno es " + promedioUno);
	
	//Realizamos 100 lanzamientos con el dado dos.
	int sumaTotalDos = 0;
	
	for(int i = 0; i < 100; i++) 
	{
		int valor = dadoDos.lanzar();
		sumaTotalDos += valor;
	}
	
	double promedioDos = sumaTotalDos / 100.0;
	System.out.println("El promedio del dado dos es " + promedioDos);
	
	
	
	//Evaluamos que promedio fue mayor.
	if(promedioUno > promedioDos) 
	{
		System.out.println("El dado uno tuvo mayor promedio con un valor de " + promedioUno);
	}
	
		System.out.println("El dado dos tuvo mayor promedio con un valor de " + promedioDos);
	
	
	

		
	}

}
