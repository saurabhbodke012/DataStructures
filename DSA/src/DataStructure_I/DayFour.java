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

    public static void main(String[] args) {
        int[] arr= {1,5,2,6,7,10,5,3};
        System.out.println(largestElement(arr));
    }
}
