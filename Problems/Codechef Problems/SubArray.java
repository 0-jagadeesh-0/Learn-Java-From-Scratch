/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SubArray
{
	public static void main (String[] args) 
	{
		// your code goes here
		try{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] A = new int [n];
		
		for(int i=0;i<n;i++){
		    A[i] = in.nextInt();
		}
		int l = in.nextInt();
		int r = in.nextInt();
		
		for(int i=l-1;i<r;i++){
		    System.out.print(A[i] +" ");
		}
        in.close();
	}
	catch(Exception e)
	{
	    return;
	}
	}
}
