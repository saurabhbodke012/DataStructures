package DataStructure_I;

public class DayEight {

    public static void matrixSnake(int[][] arr, int R, int C){

        for(int i=0; i<R; i++){
            if(i%2==0){
                for(int j=0; j<C; j++){
                    System.out.print(arr[i][j] + " " );
                }
            }else{
                for(int j=C-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        matrixSnake(arr, 4, 4);
    }

}
