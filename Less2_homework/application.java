public class application {
	
	public static void main(String[] args) {
		
		
		int lastIndex = args.length - 1;
		int currIndex = 0;
		int passes =0;
		String lastOperator = args[lastIndex];
		double mid_result = 0, prev_result=0;
		while(currIndex<lastIndex){
			int PrevCurrIndex = currIndex;
			while(currIndex<lastIndex){
			    try { 
			        Integer.parseInt(args[currIndex]); 
			    } catch(NumberFormatException e) { 
			        break; 
			    }
			    currIndex++;
			}
			
			//System.out.println(args[currIndex]);
			
			final String operator = args[currIndex];
			System.out.println(operator);
			Operation op = null;
			mid_result = Double.valueOf(args[PrevCurrIndex]);
			
			for (int j =PrevCurrIndex+1; j < currIndex; j++) {
				mid_result = OperationFactory.OpCheckExec(operator,op,mid_result, Double.valueOf(args[j]));
			}
			
			System.out.println("The result is "+ mid_result);
			currIndex++;
			op = null;
			if(passes==0) prev_result = mid_result;
			else prev_result = OperationFactory.OpCheckExec(lastOperator,op, prev_result, mid_result);
			passes++;
		}
		System.out.println("The complete result is "+ prev_result);
	}
	
}
