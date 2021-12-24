package DataStructure_I;

public class DaySix {

    public static int maxConsecutiveOnes(int[] arr){
        int count=0;
        int finalCount = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == 1){
                count ++;
            }else{
                count =0;
            }

            finalCount = Math.max(count,finalCount);
        }

        return finalCount;
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,1,0,0,1,1};

        System.out.println(maxConsecutiveOnes(arr));
    }
}
