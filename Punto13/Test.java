package Punto13;

public class Test 
{
	public static void main(String[] args) 
	{
		SuperHeroe batman = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superman = new SuperHeroe("Superman", 95, 60, 70);

		batman.competir(superman);
		superman.competir(batman);
		
		//Creamos mas superheroes
		SuperHeroe john = new SuperHeroe("John Marston", 100, 100, 100);
		SuperHeroe edgar = new SuperHeroe("Edgar Ross", 0, 0, 0);
		
		john.competir(edgar); 
		batman.competir(john);
		john.competir(superman);
	}
}
