import java.util.Scanner;

public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		int[] A =  new int[13];
		A[0] = 20;
		A[1] = 3;
		A[2] = 400;
		A[3] = 80;
		A[4] = 30;
		A[5] = 70;
		A[6] = 20;
		A[7] = 47;
		A[8] = 28;
		A[9] = 38;
		A[10] = 41;
		A[11] = 53;
		A[12] = 20;
		
		System.out.print("Please enter a number: ");
		Scanner input =  new Scanner(System.in);
		int x = input.nextInt();
 
		int k = 0;
		int i = 1;
		while(k < A.length-1)
		{	
			if(A[k] + A[i] == x)
				System.out.println("Indices " + k + " & " + i + " with values " + A[k] + " & " + A[i]);
			i++;	
			if(i ==  A.length)
			{
				k++;
				i = k + 1;
			}	
		}
	}

}
