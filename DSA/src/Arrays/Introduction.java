package Arrays;

import java.util.Arrays;

public class Introduction {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                count1 = count1 + 1;
            }else {
                count2 = Math.max(count2,count1);
                count1 =0;
            }
        }
        return Math.max(count2,count1);
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        int rem=0;
        int c=0;

        for(int i=0; i<nums.length; i++){
            count=0;
            while(nums[i]!=0){
                rem= nums[i]%10;
                nums[i] /=10;
                count++;
            }
            if(count %2==0){
                c++;
            }

        }
        return c;
    }

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i=0; i<= nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }


    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }

}
