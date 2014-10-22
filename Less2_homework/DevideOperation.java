public class DevideOperation  implements Operation {
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
	
	public DevideOperation(double new_a, double new_b) {
		setA(new_a);
		setB(new_b);
	}
	
	public double execute(){
		if(b!=0){
			return a/b;
		}
		else return 0;
	}
}
