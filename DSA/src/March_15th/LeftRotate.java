package March_15th;

import java.util.Arrays;

public class LeftRotate {

    public static int[] leftRotateArray(int[] arr, int d){
        Reverse(arr, 0, d-1);
        Reverse(arr, d,arr.length-1);
        Reverse(arr,0,arr.length-1);

        return arr;
    }

    public static int[] Reverse(int[] arr, int start, int end){

        while (start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(leftRotateArray(arr,5)));

    }
}
