package Problems.Basic_Problems;

import java.util.*;

 public class Operators
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the First Number:- ");
    Scanner input = new Scanner(System.in);
    int a= input.nextInt();  // Takes input for first Number.
    
    System.out.println("Enter the Second Number:- ");
    int b= input.nextInt();  // Takes input for Second Number.
    System.out.println("Enter the Operator:- ");
    char ch = input.next().charAt(0); // Takes input for a Character.
    input.close();
    
    if(ch=='+')
    {
      int sum= a+b;
      System.out.println("SUM= "+sum); // Sum of two Numbers.
      return;
    }
    else if(ch=='-')
    {
      int diff= a-b;
      System.out.println("DIFFERENCE= "+diff); // Differnce of two Numbers.
      return;
    }
    else if(ch=='*')
    {
      int product=a*b;
      System.out.println("PRODUCT= "+product); // Product of two Numbers.
      return;
    }
    else if(ch=='/')
    {
      float div= a/b;
      System.out.println("Quotient= "+div); // Quotient of two Numbers.
      return;
    }
    else if(ch=='%')
    {
        int mod = a%b;
        System.out.println("Remainder= "+mod);
        return;
    }
   }
 }
