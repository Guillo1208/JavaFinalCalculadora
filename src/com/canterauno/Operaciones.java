package com.canterauno;

import java.util.Scanner;

public class Operaciones {
	
	Scanner sn = new Scanner(System.in);
	//se declara una variable de tipo boolean para identificar cuando se ha inicado operacion en la calculadora
	private boolean x=false;
	private boolean y=true;
	//Se declara una variable que sea del tipo de la clase Datos
	private Datos datos;
	//constructor de la clase operacion
	public Operaciones() {
		this.datos = new Datos(0,0);
	}

	public void suma() {
		
		double result;
		//
		if(datos.isBandera()) {
			System.out.println("*************************");
			System.out.println("*INICIAREMOS OPERACIONES*");
			System.out.println("*************************");
			System.out.println("ingrese el primer numero a sumar");
			datos.setNum1(sn.nextDouble());
			System.out.println("ingrese el segundo numero a sumar");
			datos.setNum2(sn.nextDouble());
			result=datos.getNum1()+datos.getNum2();
			datos.setResultado(result);
			System.out.println("el resultado de la suma es "+result);
			datos.setBandera(x);
		}else {
			System.out.println("************************");
			System.out.println("*YA EXISTEN OPERACIONES*");
			System.out.println("************************");
			System.out.println("ingrese el numero a Sumar");
			datos.setNum1(sn.nextDouble());
			result=datos.getNum1()+datos.getResultado();
			datos.setResultado(result);
			System.out.println("el resultado de la suma es "+result);	
		}
	}
	
	public void resta() {
		double result;
		if(datos.isBandera()) {
			System.out.println("*************************");
			System.out.println("*INICIAREMOS OPERACIONES*");
			System.out.println("*************************");
			System.out.println("ingrese el primer numero a restar");
			datos.setNum1(sn.nextDouble());
			System.out.println("ingrese el segundo numero a restar");
			datos.setNum2(sn.nextDouble());
			result=datos.getNum1()-datos.getNum2();
			datos.setResultado(result);
			System.out.println("el resultado de la suma es "+result);
			datos.setBandera(x);
		}else {
			System.out.println("************************");
			System.out.println("*YA EXISTEN OPERACIONES*");
			System.out.println("************************");
			System.out.println("ingrese el numero a restar");
			datos.setNum1(sn.nextDouble());
			result=datos.getResultado()-datos.getNum1();
			datos.setResultado(result);
			System.out.println("el resultado de la resta es "+result);	
		}
	}
	
	public void multiplicacion() {
		double result;
		if(datos.isBandera()) {
			System.out.println("*************************");
			System.out.println("*INICIAREMOS OPERACIONES*");
			System.out.println("*************************");
			System.out.println("ingrese el primer numero a multiplicar");
			datos.setNum1(sn.nextDouble());
			System.out.println("ingrese el segundo numero a multiplicar");
			datos.setNum2(sn.nextDouble());
			result=datos.getNum1()*datos.getNum2();
			datos.setResultado(result);
			System.out.println("el resultado de la multiplicacion es "+result);
			datos.setBandera(x);
		}else {
			System.out.println("************************");
			System.out.println("*YA EXISTEN OPERACIONES*");
			System.out.println("************************");
			System.out.println("ingrese el numero a Multiplicar");
			datos.setNum1(sn.nextDouble());
			result=datos.getNum1()*datos.getResultado();
			datos.setResultado(result);
			System.out.println("el resultado de la multiplicacion es "+result);
			
		}
	}
	
	public void division() {
		double result;
		double aux1;
		double aux2;
		
		if(datos.isBandera()) {
			System.out.println("*************************");
			System.out.println("*INICIAREMOS OPERACIONES*");
			System.out.println("*************************");
			System.out.println("Ingresa el DIVIDENDO");
			datos.setNum1(sn.nextDouble());
			do {
				System.out.println("Ingresa el DIVISOR");
				aux1=sn.nextDouble();
				if(aux1==0) {
					System.out.println("El DIVISOR debe ser diferente a 0");
				}
				datos.setNum2(aux1);
			} while (aux1  == 0 );
			result=datos.getNum1()/datos.getNum2();
			datos.setResultado(result);
			System.out.println("el resultado de la division es "+result);
			datos.setBandera(x);
		}else {
			System.out.println("************************");
			System.out.println("*YA EXISTEN OPERACIONES*");
			System.out.println("************************");
			do {
				System.out.println("Ingresa el DIVISOR");
				aux2=sn.nextDouble();
				if(aux2==0) {
					System.out.println("El DIVISOR debe ser diferente a 0");
				}
				datos.setNum2(aux2);
			} while (aux2  == 0 );
			result=datos.getResultado()/datos.getNum2();
			datos.setResultado(result);
			System.out.println("el resultado de la division es "+result);	
		}
	}
	
	public void mod() {
		double result;
		if(datos.isBandera()) {
			System.out.println("*************************");
			System.out.println("*INICIAREMOS OPERACIONES*");
			System.out.println("*************************");
			System.out.println("ingrese el Dividendo de MOD");
			datos.setNum1(sn.nextDouble());
			System.out.println("ingrese el Divisor de MOD");
			datos.setNum2(sn.nextDouble());
			result=datos.getNum1()%datos.getNum2();
			datos.setResultado(result);
			System.out.println("el resultado del MOD es "+result);
			datos.setBandera(x);
		}else {
			System.out.println("************************");
			System.out.println("*YA EXISTEN OPERACIONES*");
			System.out.println("************************");
			System.out.println("ingrese el Divisor de MOD");
			datos.setNum1(sn.nextDouble());
			result=datos.getResultado()%datos.getNum1();
			datos.setResultado(result);
			System.out.println("el resultado del MOD es "+result);
			
		}
	}
	
	public void resultado() {
		System.out.println("***********************************************************");
		System.out.println("*EL RESULTADO DE LAS OPERACIONES ES "+datos.getResultado());
		System.out.println("***********************************************************");
	}
	
	public void reinciar() {
		datos.setNum1(0);
		datos.setNum2(0);
		datos.setResultado(0);
		datos.setBandera(y);
		System.out.println("****************************");
		System.out.println("Inicia operaciones de nuevo*");
		System.out.println("****************************");		
	}
	
}
