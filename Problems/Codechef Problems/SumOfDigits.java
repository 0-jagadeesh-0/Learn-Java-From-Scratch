/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		   Scanner in = new Scanner(System.in);
		   int  n = in.nextInt();
		   
		   for(int i = 0;i<n;i++){
		       int num= in.nextInt();
		       int sum = 0;
		       
		       while(num>0){
		           int rem = num%10;
		           sum+=rem;
		           num/=10;
		       }
		      System.out.println(sum);
		   }
           in.close();
		}
		catch(Exception e){
		    return;
		}
		}
	}

