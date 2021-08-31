package Problems.Basic_Problems;

import java.util.*;

 class Factorial
 {
   public static void main(String args[])
   { 
    System.out.println("Enter a number:- ");
    
    Scanner input = new Scanner(System.in);
    int n= input.nextInt(); // Takes integer Input from User
    input.close();
    int fact=1;
    for(int i=1; i<=n;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of "+ n+ " is: "+fact);
   }
 }