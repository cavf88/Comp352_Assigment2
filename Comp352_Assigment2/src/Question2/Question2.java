package Question2;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
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
		
		LinkedBlockingQueue<Integer> auxQueue =  new LinkedBlockingQueue<Integer>();
		
		System.out.print("Please enter a number: ");
		Scanner input =  new Scanner(System.in);
		int x = input.nextInt();
		
		for(int i = 0; i< A.length; i++)
			auxQueue.offer(A[i]);
		
		int firstElement = auxQueue.poll();
		int firstPos = 0;
		int count  = 1;
		while(!auxQueue.isEmpty())
		{
			int secondElement = auxQueue.poll();
			if(firstElement + secondElement == x)
			{
				System.out.println("Indices " + firstPos + " & " + (count + firstPos) + " with values " + firstElement + " & " + secondElement);
			}
			auxQueue.offer(secondElement);
			count++;
			
			if(count-1 ==  auxQueue.size())
			{
				firstElement = auxQueue.poll();
				count  = 1;
				firstPos++;
			}
		}

	}

}
