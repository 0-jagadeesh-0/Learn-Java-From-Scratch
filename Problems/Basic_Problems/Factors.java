import java.util.*;

 class Factors
 {
   public static void main(String args[])
   { 
    System.out.println("Enter a Number:- ");
    Scanner input= new Scanner(System.in);
    int n= input.nextInt(); // Takes Input of a Number.
    input.close();
    
    int c=2;
    System.out.println("Factors of the Number are: ");
    System.out.println(1); // Since 1 is a Common Factor for Every Number.
    while(c<=n)
    {
      if(n%c==0)  // If Remainder is = 0, then it is a Factor of that Number.
      {
        System.out.println(c);
      }
      c++; // Next Incrementing the value of c.
    }
   }
 }
