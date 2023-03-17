package DZ_1;
import java.util.Arrays;
public class DZ_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
         int val = 3;
         int temp = 0;
         for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums.length; j++) {
                 if (nums[j] == val){
                     temp = nums[j];
                     nums[j] = nums[i];
                     nums[i] = temp;
                 }
             }
             System.out.println(Arrays.toString(nums));
         }    
}
}