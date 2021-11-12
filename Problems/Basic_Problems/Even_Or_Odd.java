import java.util.*;

public class Even_Or_Odd
 {
   public static void main(String args[])
   { 
    System.out.println("Enter a number:- ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();  // Takes integer input from User
    input.close();
    if(n%2==0)  // Checks the remainder by dividing with 2.If remainder =0 it is an Even Number otherwise Odd Number.
    {
      System.out.println("Even number");
      return;
    }
    else
    System.out.println("Odd number");
    return;
   }
 }
