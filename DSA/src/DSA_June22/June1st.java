package DSA_June22;

/**
 * Topic: Recursion
 */
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

    public static int sum(int n){
        if(n<=9){
            return n;
        }
        return n%10 + sum(n/10);
    }


    public static int ropecutting(int n, int a , int b, int c){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }

        int result= Math.max(ropecutting(n-a, a,b,c),
                Math.max(ropecutting(n-b,a,b,c), ropecutting(n-c,a,b,c)));

        if(result==-1){
            return -1;
        }

        return result+1;
    }


    public static void subsets(String s, String current, int index){
        if(index== s.length()){
            System.out.println(current);
            return;
        }

        subsets(s, current, index+1);
        subsets(s, current + s.charAt(index), index+1);

    }


    public static void main(String[] args) {

//        NtoOne(5);
//        OnetoN(5);
//        System.out.println(factorial(3));
//        System.out.println(fibonacci(3));
//        System.out.println(getSum(2));
//        System.out.println(palindrome("abba",0,3));
//        System.out.println(sum(253));
//        System.out.println(ropecutting(23,11,9,12));
        subsets("ABC", "", 0);
    }

}
