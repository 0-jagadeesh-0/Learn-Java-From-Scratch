public class Linearsearch {
    public static void main(String[] args) {
        int [] arr = {12,34,6,78,89};
        int target = 99;

        System.out.println(linearsearch2(arr, target));
    }
    // return index of the target element
    static int linearsearch(int [] arr,int target){
          for (int i = 0; i < arr.length; i++) {
              if(arr[i] == target)
              {
                  return i;
              }
          }

          return -1;
    }
 // return the target element if present
    static int linearsearch2(int [] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) {
            int ans=arr[i];
            if(ans == target)
            return ans;
        }
        return -1;
    }
}
