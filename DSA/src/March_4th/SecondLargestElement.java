package March_4th;

public class SecondLargestElement {

    public static int SecondLargestElementInArray(int[] arr){

        int largest= 0;
        int second=  -1;

        for(int i=1; i<arr.length; i++){

            if(arr[i]> arr[largest]) {
                second = largest;
                largest = i;
            }else if(arr[i] != arr[largest]){
                if(second ==-1 || arr[i] > arr[second]){
                    second=i;
                }
            }

        }

        return arr[second];

    }

    public static void main(String[] args) {
        int[] arr ={40,8,50,10};

        System.out.println(SecondLargestElementInArray(arr));

    }
}
