package Punto4;

import Punto2y3.Persona;
import Punto5.Domicilio;

public class Test 
{
	public static void main(String[] args) 
	{
		//Creamos una persona le seteamos sus atributos y los imprimimos via print del metodo obtener..
		Persona fulano = new Persona();
		
		fulano.ponerNombre("Fulano");
		fulano.ponerApellido("Gomez");
		
		System.out.println(fulano.obtenerNombreCompleto());
		
		//Repetimos lo mismo con otra persona.
		Persona yo = new Persona();
		
		yo.ponerNombre("Agustin");
		yo.ponerApellido("Dahbar");
		
		System.out.println(yo.obtenerNombreCompleto());
		
		
		//5D)
		Domicilio casaFulano = new Domicilio("Conesa", 1000, "CABA");
		fulano.setDomicilio(casaFulano);


		//5E)
		yo.setDomicilio(casaFulano);
		
		
		//5F)
		casaFulano.setNumero(1050);
		
		//5G
		System.out.println(yo);
		System.out.println(fulano);
	}
}
