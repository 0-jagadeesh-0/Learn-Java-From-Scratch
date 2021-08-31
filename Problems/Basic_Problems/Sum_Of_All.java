package Problems.Basic_Problems;

import java.util.*;

 public class Sum_Of_All
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the values:- ");
    Scanner input = new Scanner(System.in);
    
    
    int n = input.nextInt(); // Takes integer Input.
    int sum=n;
    
    while(n!=0)  // Loop executes untill User enters Zero and gives the sum of all numbers entered by User.
    {
      n = input.nextInt();
      sum=sum+n;
    }
    input.close();
    System.out.println("Sum of the Values="+sum);
   }
 }
