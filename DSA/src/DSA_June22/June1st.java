package DSA_June22;

public class June1st {

    public static void NtoOne (int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        NtoOne(n-1);
    }

    public static void OnetoN (int n){

        if(n==0){
            return;
        }
        OnetoN(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
       if(n<=1){
           return n;
       }
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static void main(String[] args) {

//        NtoOne(5);
//        OnetoN(5);
//        System.out.println(factorial(3));
        System.out.println(fibonacci(3));
    }
}
