package Arrays;

import java.util.Arrays;

public class Delete {

    public int removeElement(int[] nums, int val) {
        int j= 0;
        for (int i=0; i< nums.length; i++){
            if (nums[i]!=val){
                nums[j]= nums[i];
                j++;
            }
        }
        return j;
    }

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int j=0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;
    }

}
