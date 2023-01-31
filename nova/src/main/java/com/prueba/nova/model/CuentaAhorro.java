package com.prueba.nova.model;

public class CuentaAhorro {

	private String nombres;

	private String apellidos;

	private int edad;

	private long numeroCuenta;

	private long saldo;

	private double interes;

	public CuentaAhorro(String nombres, String apellidos, int edad, long numeroCuenta, long saldo, double interese) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.interes = interese;
	}

	public CuentaAhorro(long numeroCuenta, long saldo, double interese) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.interes = interese;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public double getInterese() {
		return interes;
	}

	public void setInterese(double interese) {
		this.interes = interese;
	}

}
