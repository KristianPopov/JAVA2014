public class OperationFactory{
	static double OpCheckExec(String operator,Operation op,double a, double b){
		switch (operator) {
		case "+":
			op = new PlusOperation(a,b);
			break;
		case "-":
			op = new MinusOperation(a,b);
			break;
		case "/":
			op = new DevideOperation(a,b);
			break;
		case "*":
			op = new MultiplOperation(a,b);			
			break;
		}
		return op.execute();
	}
}
