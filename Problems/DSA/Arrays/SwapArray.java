public class SwapArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        swap(arr,0,5);

        System.out.print(arr);
    }
  static void swap(int [] arr,int index1,int index2){
      int temp= arr[index1];
      arr[index1]=arr[index2];
      arr[index2]=temp;
    
  }

 
 
static int maxRange(int [] arr,int start,int end){
    int max=start;
      for (int i = start; i <= end; i++) {
          if(arr[i]>max){
              max=arr[i];
          }
      }
      return max;
}
}

