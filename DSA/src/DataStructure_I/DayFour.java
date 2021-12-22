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

    public static boolean sorted(int[] arr){
        int index=0;
        boolean flag= true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[index] || arr[i] == arr[index]) {
                index++;
                continue;
            }else{
                return false;
            }
        }

        return flag;
    }



    public static void main(String[] args) {
        int[] arr= {1,1,1,0};
        System.out.println(sorted(arr));
    }
}
