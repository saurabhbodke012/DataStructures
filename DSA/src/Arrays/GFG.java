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

    public static void frequencySortedArray(int[] arr){
        int index=0;
        int count =1;

        for(int i=1; i<arr.length; i++){

            if(arr[i] != arr[index]){
                System.out.println("Element: " + arr[index] + " has appeared " + count + " times.");
                count=1;
                index++;
            }else {
                index++;
                count++;
            }

            if(i==arr.length -1){
                System.out.println("Element: " + arr[index] + " has appeared " + count + " times.");
            }

        }
    }

    public static void maxProfit(int[] arr){
        int minVal= arr[0];
        int maxProfit =  arr[1] - arr[0];
        int res=0;

        for(int i=1;i<arr.length;i++){
           res= arr[i] - minVal;
           maxProfit= Math.max(res, maxProfit);
           minVal=  Math.min(minVal, arr[i]);
        }

        System.out.println("The max profit is: " + maxProfit);

    }

    public static int getWater(int[] arr){

        int water=0;
        int res=0;
        for (int i=1; i<arr.length; i++){
            if (arr[i]< arr[res]){
                res = i;
            }
        }

        if(res== 0 || res== arr.length-1){
            return 0;
        }

        int leftMax =  arr[0];
        for(int i=0; i<res; i++){
            leftMax =  Math.max(leftMax, arr[i]);
        }

        int rightMax =  arr[res+1];
        for(int i=res+1; i<arr.length; i++){
            rightMax =  Math.max(rightMax, arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            water = water + ((Math.min(leftMax,rightMax)) - arr[i]);
        }

        return water;

    }

    public static void main(String[] args) {
        int[] arr={3,0,1,2,5};

//        rightRotate(arr,3);
//        leftRotate(arr,3);
//        frequencySortedArray(arr);
//        maxProfit(arr);
        System.out.println(getWater(arr));
    }
}
