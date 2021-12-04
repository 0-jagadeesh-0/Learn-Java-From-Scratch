import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={-9,5,-2,0,51};
        selection(arr);

        System.out.println(Arrays.toString(arr));
        
    }
    
    static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i - 1;
            int maxIndex = maximum(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }

    static int maximum(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
        if(arr[i]>arr[max]){
        max = i;
        }
    }
        return max;
    }

    static void swap(int[] arr,int maxIndex,int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
