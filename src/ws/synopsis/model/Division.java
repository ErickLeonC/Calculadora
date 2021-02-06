package ws.synopsis.model;

public class Division extends Operation {
	double div;

	public Division(double n1, double n2) {
		super(n1, n2);
		div = n1 / n2;
		this.setResult(div);
	}
}
