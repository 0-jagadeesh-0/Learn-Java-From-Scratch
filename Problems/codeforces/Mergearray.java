package Problems.codeforces;

import java.util.Arrays;
import java.util.Scanner;

/*
    You are given two arrays, sorted in non-decreasing order. 
    Merge them into one sorted array.
*/

public class Mergearray {
    public static int[] merge(int[] a,int[] b) 
    {
        int n=a.length;
        int m=b.length;
        int[] ans=new int[n+m];
        int i=0;
        int j=0;
        while(i<n||j<m)
        {
            if (j==m||i<n&&a[i]<b[j]) 
            {
              ans[i+j]=a[i];
              i++;  
            }
            else 
            {
                ans[i+j]=b[j];
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) 
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] a=new int[x];
            int[] b=new int[y];
            for (int i = 0; i <x; i++) 
            {
                a[i]=sc.nextInt();
            } 
            for (int i = 0; i <y; i++) 
            {
                b[i]=sc.nextInt();
            }  
            int[] res=new int[x+y];
            res=Arrays.copyOf(merge(a, b), x+y);

            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]+" ");
            }
        }
    }
}
