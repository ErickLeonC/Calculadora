package ws.synopsis.model;

public class Operation {
	double n1;
	double n2;
	double result;

	public Operation(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public void mostrarResult() {

		System.out.println("El resultado es :" + this.result);

	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
