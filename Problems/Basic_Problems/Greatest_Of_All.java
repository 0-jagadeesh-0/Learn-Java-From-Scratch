package Problems.Basic_Problems;

import java.util.*;

 public class Greatest_Of_All
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the Values:- ");
    
    Scanner input= new Scanner(System.in);
    int n= input.nextInt(); //Takes Input from User.
    int max=n;
    while(n!=0) // Checks which is the greatest Number untill user enters 0.
    {
      n= input.nextInt();
      if(n>max)
      max=n;
      
    }
    input.close();
    System.out.println("Largest Number: "+max);
   }
 }
