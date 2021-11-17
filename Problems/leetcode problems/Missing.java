 public class Missing {
    public static void  main(String[] args) {
        int [] nums = {5,4,2,0,1};
        System.out.println(missing(nums));
        
    }
    
    static int missing(int [] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]; // numbers are in the range of 0 to n
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
              return index;
            }    
            }
        return nums.length;

    }

     static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
          nums[first] = nums[second];
          nums[second]= temp;
    }
}
