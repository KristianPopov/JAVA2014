public class application {

	public static void main(String[] args) {
		int lastIndex = args.length - 1;
		final String operator = args[lastIndex];
		Operation op = null;
		double result = Double.valueOf(args[0]);
		for (int i = 1; i < lastIndex; i++) {
			result = OperationFactory.OpCheckExec(operator,op,result, Double.valueOf(args[i]));
		}
		System.out.println("The result is "+ result);
	}

}
