package Punto13;

public class Test 
{
	public static void main(String[] args) 
	{
		SuperHeroe batman = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superman = new SuperHeroe("Superman", 95, 60, 70);

		System.out.println(batman.competir(superman));
		System.out.println(superman.competir(batman));
		
		//Creamos más superheroes
		SuperHeroe john = new SuperHeroe("John Marston", 100, 100, 100);
		SuperHeroe edgar = new SuperHeroe("Edgar Ross", 0, 0, 0);
		
		System.out.println(john.competir(edgar));
		System.out.println(batman.competir(john));
		System.out.println(john.competir(superman));
		
		//Discipulo vs maestro
		SuperHeroe ruben = new SuperHeroe("Ruben Gutierrez", 100, 100, 99);
		SuperHeroe yo = new SuperHeroe("Agustin Dahbar", 100, 100, 98);
		
		System.out.println(yo.competir(ruben)); //Estuvo cerca.
	}
}


