import java.util.Arrays;

public class LinearSearchin2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {12,45,6,89},
            {98,54,7,19},
            {90,52}
        };
        int target = 199;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int [] search(int [][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }

            }
        }

        return new int[]{-1,-1};
    }
}
