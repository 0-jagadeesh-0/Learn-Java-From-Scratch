package Problems.Basic_Problems;

import java.util.*;

 class Greatest
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the First Number:- ");
    Scanner input = new Scanner(System.in);
    int a= input.nextInt(); // Takes input of First Number.
    
    System.out.println("Enter the Second Number:- ");
    int b= input.nextInt(); // Takes input of Second Number.
    input.close();
    
    if(a>b) // Compares Two Numbers which is Greater.
    {
      System.out.println(a+ " is the Greatest Number.");
      return;
    }
    
    else
    System.out.println(b+ " is the Greatest Number.");
   }
 }
