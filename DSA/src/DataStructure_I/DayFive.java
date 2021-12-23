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

    public static void leadersArray(int[] arr){
        int leader = arr[arr.length-1];
        System.out.println(leader);
        for(int i=arr.length-2; i>=0; i--){

            if(leader < arr[i]) {
                leader = arr[i];
                System.out.println(leader);
            }

        }
    }

    public static void maxDifference(int[] arr){
       int res = arr[0] - arr[1];
       int minVal = arr[0];

       for(int j=1; j<arr.length; j++){
           res = Math.max(res, arr[j] - minVal);
           minVal = Math.min(minVal, arr[j]);
       }

        System.out.println(res);
    }

    public static void frequency(int[] arr){

        int count =1;
        int index=0;
        for(int i=1; i<arr.length; i++){

            if(arr[index] != arr[i] ){
                System.out.println("Element: " + arr[index] + " has appeared " + count + " times.");
                count=1;
                index++;
            }else{
                count++;
                index++;
            }

            if(i==arr.length -1){
                System.out.println("Element: " + arr[index] + " has appeared " + count + " times.");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr= {10,10,10,20,20,30};
        frequency(arr);
    }
}
