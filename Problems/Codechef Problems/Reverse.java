
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i<n;i++){
		    int num = in.nextInt();
		    int ans =0;
		    while(num!=0){
		        
		        int rem = num%10;
		        
		       ans = ans*10 + rem;
		        
		       num/=10;
		    }
		    System.out.println(ans);
            in.close();
		}
		
	}
	
	catch(Exception e){
	    return;
	}
	}
	}
	

