package March_14th;

import java.util.Arrays;

public class MoveZeros {

    public static int[] moveZeros(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0 ){
                int temp= arr[i];
                arr[i]= arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {10,10,0,20,0,0,30,0,30};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

}
