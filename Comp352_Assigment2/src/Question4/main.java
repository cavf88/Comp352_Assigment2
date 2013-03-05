package Question4;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArray<Integer> stack =  new StackArray<Integer>();
		boolean expansionRule = false;
		for(int i  = 0; i< 30000; i++)
		{
			if(expansionRule)
				stack.setExpansionRule('c');
			else
				stack.setExpansionRule('d');
			long startTime = System.currentTimeMillis();
			stack.push(i);
			long finishTime = System.currentTimeMillis();
			//stack.truncate();
			if(i%100 == 0)
			{
				if(finishTime - startTime > 0)
					System.out.println(finishTime-startTime + "    " + i + "   " + expansionRule);
				expansionRule = !expansionRule;
			}
		}
		/*System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.truncate();
		stack.push(11);
		stack.push(12);
		stack.truncate();
		/*System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		/*System.out.println(stack.isEmpty());
		
		stack.truncate();/*
		
		
		/*System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		//System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());*/
		
		
		
	}

}
