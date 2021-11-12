// Formatting the Date
/* Suppose if we enter d=30;m=7;y=2002;
It must give output as 30th July 2002 */

import java.util.*;
 class Date{
    public static void main(String[] args) {
         System.out.print("d=");
         Scanner in = new Scanner(System.in);
         int d=in.nextInt();
         System.out.print("m=");
         int m=in.nextInt();
         System.out.print("y=");
         int y=in.nextInt();
         in.close();

           switch(m) 
           {
                case 1: System.out.println(d+"th"+" "+"January" +" "+y); 
                break;
                case 2: System.out.println(d+"th"+" "+"February" +" "+y); 
                break;
                case 3: System.out.println(d+"th"+" "+"March" +" "+y);  
                break;
                case 4: System.out.println(d+"th"+" "+"April" +" "+y); 
                break;
                case 5: System.out.println(d+"th"+" "+"May" +" "+y); 
                break;
                case 6: System.out.println(d+"th"+" "+"June" +" "+y); 
                break;
                case 7: System.out.println(d+"th"+" "+"July" +" "+y); 
                break;
                case 8: System.out.println(d+"th"+" "+"August" +" "+y); 
                break;
                case 9: System.out.println(d+"th"+" "+"September" +" "+y); 
                break;
                case 10: System.out.println(d+"th"+" "+"October" +" "+y); 
                break;
                case 11: System.out.println(d+"th"+" "+"November" +" "+y); 
                break;
                case 12: System.out.println(d+"th"+" "+"December" +" "+y);  
                break;
           }
          
    }
}