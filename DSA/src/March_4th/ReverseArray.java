package March_4th;

import java.util.Arrays;

public class ReverseArray {

    public static int[] Reverse(int[] arr){

        int start=0;
        int end=arr.length-1;

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

        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(Reverse(arr)));
    }
}
