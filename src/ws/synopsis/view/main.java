package ws.synopsis.view;

import java.util.Scanner;

import ws.synopsis.model.Add;
import ws.synopsis.model.Division;
import ws.synopsis.model.Multiplication;
import ws.synopsis.model.Subtract;

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
			Add suma = new Add(n1, n2);
			suma.mostrarResult();
			break;
		case ("-"):
			Subtract resta = new Subtract(n1, n2);
			resta.mostrarResult();
			break;
		case ("*"):
			Multiplication multi = new Multiplication(n1, n2);
			multi.mostrarResult();
			break;
		case ("/"):
			Division div = new Division(n1, n2);
			div.mostrarResult();
			break;
		default:
			System.out.println("Ingrese una opción válida");
		}
	}
}
