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
	
	//Acciones de la cuenta
	public double obtenerSaldo() 
	{
		return saldo;
	}
	
	public void depositar(int deposito) 
	{
		this.saldo += deposito;
	}
	
	public void extraer(int extraccion) 
	{
		this.saldo -= extraccion;
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
}
