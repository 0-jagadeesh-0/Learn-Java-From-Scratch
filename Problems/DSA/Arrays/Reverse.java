package Problems.DSA.Arrays;

/**
 * Reverse
 */
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length/2; i++) 
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-i-1]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}