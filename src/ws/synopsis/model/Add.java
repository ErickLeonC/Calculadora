package ws.synopsis.model;

public class Add extends Operation {
	  double suma;
      
	  public Add(double n1, double n2) {
	             
	        super(n1, n2); //invoca o llama al constructor de la clase padre que comparta el mismo tipo de parametrización
	        suma = n1 + n2;
	        this.setResult(suma);
	    }
}
