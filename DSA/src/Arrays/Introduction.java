package Arrays;

public class Introduction {
    public int findMaxConsecutiveOnes(int[] nums){
        int count =0;
        int res= 0;

        for(int i=1; i< nums.length; i++){
            if(nums[res]==1){
                if(nums[res]== nums[i]){
                    count++;
                    res++;
                }
            }else{
                res++;
                count=0;
            }
        }

        return count;
    }

}
