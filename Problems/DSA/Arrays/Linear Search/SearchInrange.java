public class SearchInrange {
    public static void main(String[] args) {
        int [] arr = {2,3,67,8,89,43,21,56};
        int target = 89;

        System.out.println(search(arr,target,1,5));
    }
    static int search(int [] arr, int target,int start, int end){
        if(arr.length == 0)
        return -1;

        for (int i = start; i <= end; i++) {
            if(arr[i] == target)
            return i;
        }

        return -1;
    }
}
