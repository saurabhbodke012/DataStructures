package Arrays;

import java.util.Arrays;

public class GFG {

    public static int[] reverseArray(int[] arr){
        int j=arr.length-1;
        int[] arrCopy = Arrays.copyOf(arr,arr.length);
        for(int i=0; i<arr.length;i++){
            arr[i] = arrCopy[j];
            j--;
        }
        return arr;
    }

    public static int[] movesZerosToEnd(int[] arr){
        int count=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = 0;
                arr[count]=temp;
                count++;
            }
        }
        return arr;
    }

    public static void rightRotate(int[] nums, int k) {
        int n= nums.length;
        helper(nums,n-k, n-1);
        helper(nums,0,n-k-1);
        helper(nums,0,n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void leftRotate(int[] nums, int k) {
        int n= nums.length;
        helper(nums,0, k-1);
        helper(nums,k,n-1);
        helper(nums,0,n-1);

        System.out.println(Arrays.toString(nums));

    }

    public static void helper(int[] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={10,5,6,9,7,30};

        rightRotate(arr,3);
        leftRotate(arr,3);
    }
}
