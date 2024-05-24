package Punto13;

public class SuperHeroe 
{
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	final int MAXIMO = 100;
	final int MINIMO = 0;
	
	//Constructor que ya que tiene que validar datos para 3 de las 4 propiedades, utiliza metodos que realizan dicho procedimiento mediante el 
	//encapsulamiento de otro metodo base para validar los datos (línea 43)
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) 
	{
		this.nombre = nombre; 
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	
	//Setters (los int tendrán composición de metodos para no tener que repetir la misma lógica desarrollada en los 3 de ellos.
	private void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	private void setFuerza(int numero) 
	{
		this.fuerza = validarDatos(numero);
	}
	
	private void setResistencia(int numero) 
	{
		this.resistencia = validarDatos(numero);
	}
	
	private void setSuperpoderes(int numero) 
	{
		this.superpoderes = validarDatos(numero);
	}
	
	
	//Validamos que los argumentos númericos sean correctos con este metodo. Lo incorporaremos en todos los setters.
	public int validarDatos(int numero) 
	{
		if(numero < MINIMO) 
		{
			return 0;
		}
		else if(numero > MAXIMO) 
		{
			return 100;
		}
		else 
		{
			return numero;
		}
	}

	//Competir entre superheroes
	public Resultado competir(SuperHeroe rival) 
	{
		int triunfosProta = 0;
		int triunfosRival = 0;
		
		if(this.fuerza > rival.fuerza)
		{
			triunfosProta++;
		}
		else 
		{
			triunfosRival++;
		}
		
		if(this.resistencia> rival.resistencia)
		{
			triunfosProta++;
		}
		else 
		{
			triunfosRival++;
		}
		
		if(this.superpoderes> rival.superpoderes)
		{
			triunfosProta++;
		}
		else 
		{
			triunfosRival++;
		}
		
			
		if(triunfosProta >= 2) 
		{
			return Resultado.TRIUNFO;
		}
		else if(triunfosRival >= 2) 
		{
			return Resultado.DERROTA;
		}
		
			return Resultado.EMPATE;
		
	}
	
	
	
	//ToString
	@Override
	public String toString() {
		return "SuperHeroe [" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
}
