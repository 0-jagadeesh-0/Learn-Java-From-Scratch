package Problems.Basic_Problems;

import java.util.*;

 public class Simple_Interest
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the value of Principle:- ");
    Scanner input = new Scanner(System.in);
    int P= input.nextInt();
    System.out.println("Enter the value of Rate:- ");
    float R = input.nextFloat();
    System.out.println("Enter the value of Time");
    float T= input.nextFloat();
    input.close();
    
    float Simple_interest= (P*T*R) / 100; // Formula to calculate Simple Interest.
    
    System.out.println(Simple_interest);
    
   }
 }
