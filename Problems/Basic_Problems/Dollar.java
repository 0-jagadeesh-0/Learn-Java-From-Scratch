package Problems.Basic_Problems;

import java.util.*;

 class Dollar
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the Currency in Rupee: ");
    Scanner input= new Scanner(System.in);
    int Rupees= input.nextInt(); // Takes Input from the User.(In Rupees)
    input.close();
    double Dollar = Rupees* 74.1755 ; // Condition to convert Rupees to Dollars.
    System.out.println("DOLLARS= "+Dollar);
   }
 }
