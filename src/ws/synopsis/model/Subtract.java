package ws.synopsis.model;

public class Subtract extends Operation {
	double resta;

	public Subtract(double n1, double n2) {

		super(n1, n2);
		resta = n1 - n2;
		this.setResult(resta);
	}
}
