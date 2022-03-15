package March_14th;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr ){

        int index=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[index-1]){
                arr[index] =  arr[i];
                index++;
            }
        }

    return index;

    }

    public static void main(String[] args) {

        int arr[] = {10,10,20,20,20,30,30,30,30};
        System.out.println(removeDuplicates(arr));
    }


}
