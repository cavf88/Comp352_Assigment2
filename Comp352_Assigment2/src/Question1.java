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
		for(int i = 0; i< A.length; i++)
			for(int k = i+1; k<A.length; k++)
				if(A[i] + A[k] ==  x)
					System.out.println("Indices " + i + " & " + k + " with values " + A[i] + " & " + A[k]);
	}

}
