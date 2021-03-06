public class PlusOperation implements Operation {
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public PlusOperation(double new_a, double new_b) {
		setA(new_a);
		setB(new_b);
	}
	
	public double execute(){
		return a+b;
	}
}
