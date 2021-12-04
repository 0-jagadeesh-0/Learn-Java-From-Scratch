public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,9,12,15,18,19,23};
        int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    // return the index of the target
    static int search(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target< arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
