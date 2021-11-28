package Arrays;

import java.util.Arrays;

public class Largest {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int res=0;
        int counter=0;
        int n= nums.length;
        for(int i=n-1; i>=(n-k); i--){
            res= nums[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};

        System.out.println(findKthLargest(nums,4));
    }
}
