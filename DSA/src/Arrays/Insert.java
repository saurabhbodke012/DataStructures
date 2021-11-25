package Arrays;

import java.util.Arrays;

public class Insert {

    public static void duplicateZeros(int[] arr) {
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                for(int j= (n-2); j>=(i+1); j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr= {1,0,2,3,0,4,5,0};

        duplicateZeros(arr);
    }
}
