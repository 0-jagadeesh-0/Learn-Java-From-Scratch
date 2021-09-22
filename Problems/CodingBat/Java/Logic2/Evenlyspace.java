package Problems.CodingBat.Java.Logic2;

import java.util.*;

/**
 * Evenlyspace
 */
/** 
 *  Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced, so the difference between small and medium
    is the same as the difference between medium and large.
  */


public class Evenlyspace {

    public static boolean evenlyspace(int a,int b,int c) {

        int small = Math.min(Math.min(a, b), c);
        int large = Math.max(Math.max(a, b), c);
        int medium = a+b+c-(small+large);
        boolean ans=Math.abs(small-medium)==Math.abs(medium-large)?true:false;

        return ans;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            System.out.println(evenlyspace(a, b, c));
            
        }
        sc.close();    
   }
}