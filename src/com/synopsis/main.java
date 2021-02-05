package com.synopsis;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 
		Scanner leer = new Scanner(System.in);
		
		System.out.println("CALCULADORA B�SICA");
		System.out.println("SUMAR : (+)");
		System.out.println("RESTAR : (-)");
		System.out.println("MULTIPLICAR : (*)");
		System.out.println("DIVIDIR : (/)");
		
		System.out.println("Ingrese la operaci�n a realizar: ");
		String action = leer.next();
		
		System.out.println("Ingrese el primer n�mero: ");
		double n1 = leer.nextDouble();
		
		System.out.println("Ingrese el segundo n�mero: ");
		double n2 = leer.nextDouble();	
		
		switch (action) {
		case ("+"):
			Suma suma = new Suma(n1,n2);
			suma.mostrarResult();
			break;
		case ("-"):
			Resta resta = new Resta(n1,n2);
			resta.mostrarResult();
			break;
		case ("*"):
			Multiplicacion multi = new Multiplicacion(n1,n2);
			multi.mostrarResult();
			break;
		case ("/"):
			Division div = new Division(n1,n2);
			div.mostrarResult();
			break;
		default:
			System.out.println("Insertar una operaci�n  v�lida");
			break;
		}
	}

}
