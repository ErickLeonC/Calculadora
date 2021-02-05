package com.synopsis;

public class Resta extends Operacion {
    double resta;
    
    public Resta(double n1, double n2) {
             
        super(n1, n2);
        resta = n1 - n2;
        this.setResult(resta);
    }
}
