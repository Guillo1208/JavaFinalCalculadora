package com.canterauno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

public static void main(String[] args) {
		
		Operaciones ope = new Operaciones();
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opc;
		
		while (!salir) {
			System.out.println("======================");
			System.out.println("|CALCULADORA          |");
			System.out.println("======================");
			System.out.println("|1. SUMA              |");
			System.out.println("|2. RESTA             |");
			System.out.println("|3. MULTIPLICACION    |");
			System.out.println("|4. DIVISION          |");
			System.out.println("|5. MOD               |");
			System.out.println("|6. RESULTADO         |");
			System.out.println("|7. REINICIAR VALORES |");
			System.out.println("|8. SALIR             |");
			System.out.println("======================");
			
			try {
				System.out.println("ESCOGE LA OPERACION A REALIZAR");
				opc = sn.nextInt();
				
				switch (opc) {
				case 1: 
					ope.suma();
					break;
				
				case 2:
					ope.resta();
					break;
					
				case 3:
					ope.multiplicacion();
					break;
					
				case 4:
					ope.division();
					break;
					
				case 5:
					ope.mod();
					break;
					
				case 6:
					ope.resultado();
					break;
					
				case 7:
					ope.reinciar();
					break;
					
				case 8:
					System.out.println("SALIDA EXITOSA");
					salir=true;
					break;
					
					
				default:
					System.out.println("SOLO OPCIONES ENTRE 1-8");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("DEBES INSERTAR UN NUMERO");
				sn.next();
			}
			
		}
		System.exit(0);

	}

}
