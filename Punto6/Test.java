package Punto6;

public class Test{

	public static void main(String[] args) {

	//Creamos los dados
	Dado dadoUno = new Dado();
	Dado dadoDos = new Dado();
	
	//Los lanzamos
	int valorUno = dadoUno.lanzar();
	int valorDos = dadoDos.lanzar();
	
	System.out.println(valorUno);
	System.out.println(valorDos);
	
	//Evaluamos cual cayó con un valor mayor.
	if(valorUno == valorDos) 
	{
		System.out.println("Los dados tuvieron el mismo valor (" + valorUno + ").");
	}
	else if(valorUno > valorDos)
	{
		System.out.println("El mayor valor fue " + valorUno);
	}

		System.out.println("El mayor valor fue " + valorDos);

	
	
	
	////Realizamos 100 lanzamientos con el dado uno.
	int sumaTotal = 0;
	
	for(int i = 0; i < 100; i++) 
	{
		int valor = dadoUno.lanzar();
		sumaTotal += valor;
	}
	
	double promedioUno = sumaTotal / 100.0;
	
	System.out.println(promedioUno);
	
	//Realizamos 100 lanzamientos con el dado dos.
	int sumaTotalDos = 0;
	
	for(int i = 0; i < 100; i++) 
	{
		int valor = dadoDos.lanzar();
		sumaTotalDos += valor;
	}
	
	double promedioDos = sumaTotalDos / 100.0;
	System.out.println(promedioDos);
	
	
	
	//Evaluamos que promedio fue mayor.
	if(promedioUno > promedioDos) 
	{
		System.out.println("El dado uno tuvo mayor promedio con un valor de " + promedioUno);
	}
	
		System.out.println("El dado uno tuvo mayor promedio con un valor de " + promedioDos);
	
	
	

		
	}

}
