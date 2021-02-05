package com.synopsis;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 
		Scanner leer = new Scanner(System.in);
		
		System.out.println("CALCULADORA BÁSICA");
		System.out.println("SUMAR : (+)");
		System.out.println("RESTAR : (-)");
		System.out.println("MULTIPLICAR : (*)");
		System.out.println("DIVIDIR : (/)");
		
		System.out.println("Ingrese la operación a realizar: ");
		String action = leer.next();
		
		System.out.println("Ingrese el primer número: ");
		double n1 = leer.nextDouble();
		
		System.out.println("Ingrese el segundo número: ");
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
			System.out.println("Insertar una operación  válida");
			break;
		}
	}

}
