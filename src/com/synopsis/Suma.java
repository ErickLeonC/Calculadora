package com.synopsis;

public class Suma extends Operacion {
	  double suma;
      
	  public Suma(double n1, double n2) {
	             
	        super(n1, n2);
	        suma = n1 + n2;
	        this.setResult(suma);
	    }
}
