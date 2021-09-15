package Problems.Basic_Problems;

import java.util.*;

 public class Greeting_Message
 {
   public static void main(String args[])
   { 
    System.out.println("Enter a name:- "); // To print Enter a Name.
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();  //Takes input for a Name
    input.close();
    System.out.println("Hai "+ name +"! "+ "How are you???"); // It adds Hai,name entered by user and How are you? and prints.
   }
 }

