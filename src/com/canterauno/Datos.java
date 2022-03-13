package com.canterauno;

public class Datos {

	private double num1;
	private double num2;
	private double resultado;
	private boolean bandera;
	
	public boolean isBandera() {
		return bandera;
	}

	public void setBandera(boolean bandera) {
		this.bandera = bandera;
	}

	/*public Datos(double num1, double num2, double resultado) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}*/
	
	public Datos(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.bandera=true;
	}

	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
}
