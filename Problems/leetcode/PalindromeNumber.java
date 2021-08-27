package Problems.leetcode;

import java.util.Scanner;

/**
 * PalindromeNumber
 * Find a whether the given Integer is Palindrome Integer or not.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) 
    {
        int rem=0;
        int temp=x;
        int sum=0;
        while (x>0) 
        {
           rem=x%10;
           x/=10;
           sum=sum*10+rem;
        }
        if (sum==temp) 
        {
          return true;  
        }
        else 
        {
           return false; 
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=isPalindrome(n);
        System.out.println(res);
        sc.close();
    }
    
}