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

    public static int getSum(int n){
        if(n==0){
            return 0;
        }
        return n + getSum(n-1);
    }

    public static boolean palindrome(String inp, int start, int end){

        if(start>=end){
            return true;
        }

        boolean b = ( inp.charAt(start) == inp.charAt(end) ) && palindrome(inp, start + 1, end - 1);
        return b;
    }


    public static void main(String[] args) {

//        NtoOne(5);
//        OnetoN(5);
//        System.out.println(factorial(3));
//        System.out.println(fibonacci(3));
//        System.out.println(getSum(2));
//        System.out.println(palindrome("abba",0,3));
    }

}
