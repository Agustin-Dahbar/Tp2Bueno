package Punto9;

import Punto2y3.Persona;

public class CuentaBancaria 
{
	private String CBU;
	private TipoCuenta tipo;
	private double saldo;
	private Persona titular;
	
	//Constructor parametrizado
	public CuentaBancaria(TipoCuenta tipo, double saldo, Persona titular) 
	{
		this.tipo = tipo;
		this.saldo = saldo;
		this.titular = titular;
		this.CBU = generarCBU();
	}
	
	//Metodo que genera el CBU
	public String generarCBU() 
	{
		return (this.tipo.ordinal() + 10) + "-" + this.titular.obtenerDNI() + "-" + (this.titular.obtenerDNI() % 10);
	}
	
	
	public void depositar(int deposito) 
	{
		this.saldo += deposito;
	}
	
	public boolean extraer(double extraccion) 
	{
		if(extraccion > this.saldo) //Si la extraccion es mayor al saldo que poseemos.. 
		{
			System.out.println("No tienes saldo suficiente");
			return false;
		}
		
		//Si no.. (el saldo es suficiente) 
		this.saldo -= extraccion;
		System.out.println("Extraccion realizada");
		return true;
	}
	
	//Acciones de la cuenta
	public double obtenerSaldo() 
	{
		return saldo;
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [CBU = " + this.CBU + ", Tipo = " + this.tipo + ", Saldo = " + this.saldo + ", Titular = " + this.titular + "]";
	}
	
}
