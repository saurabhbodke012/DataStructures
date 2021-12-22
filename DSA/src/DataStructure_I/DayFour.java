package DataStructure_I;

public class DayFour {

    public static int largestElement(int[] arr){
        int largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;

    }

    public static int secondLargestElement(int[] arr){
        int largest = arr[0];
        int secLargest= -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] != largest){
                if(arr[i] > secLargest || secLargest == -1){
                    secLargest = arr[i];
                }
            }
        }

        return secLargest;

    }



    public static void main(String[] args) {
        int[] arr= {1,5,2,6,7,10,5,3};
        System.out.println(secondLargestElement(arr));
    }
}
