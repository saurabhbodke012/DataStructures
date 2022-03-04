package March_4th;

public class LargestElement {

    public static int largestElementInArray(int[] arr){

        int largest =  arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr ={40,8,50,10};

        System.out.println(largestElementInArray(arr));

    }

}
