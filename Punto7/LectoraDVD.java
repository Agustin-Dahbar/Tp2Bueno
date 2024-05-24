package Punto7;

public class LectoraDVD 
{
	private String marca;
	
	private boolean capazDeGrabar() 
	{
		if(marca == "Sony") 
		{
			return true;
		}
			return false;
	}
}
