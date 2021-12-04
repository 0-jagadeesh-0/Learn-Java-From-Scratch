import java.util.ArrayList;

public class AllDisappearedNos{
    public static void  main(String[] args) {
        int [] nums = {6,4,2,1,2,3,7,3,8};
        System.out.println(missing(nums));
        
    }
    
    static ArrayList<Integer> missing(int [] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1; // numbers are in the range of 0 to n
            if( nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index +1 ){
              list.add(index+1 );
            }    
            }
        return list;

    }

     static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
          nums[first] = nums[second];
          nums[second]= temp;
    }
}
