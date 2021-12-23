package DataStructure_I;

import java.util.Arrays;

public class DayFive {

    public static void leftRotateArrayByOne(int[] arr){
        int temp = arr[0];

        for(int i=1;i<arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));

    }

    public static void leftRotateArrayByD(int[] arr, int d){

        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, arr.length-1);
        reverseArray(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] reverseArray(int[] arr, int start, int end){
        int temp=0;

        while(start<end){
            temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        leftRotateArrayByD(arr,2);
    }
}
