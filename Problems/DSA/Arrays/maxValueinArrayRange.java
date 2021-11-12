public class maxValueinArrayRange {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5,6};
            System.out.println(maxRange(arr,1,4));
        }
        static int maxRange(int [] arr,int start, int end)
      {
          int max=start;
          for (int i = start; i < end; i++) {
              if(arr[i]>max){
                  max=arr[i];
              }
          }
          return max;
      }
    }
    

