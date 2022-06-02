package DSA_June22;

import java.util.Arrays;

/**
 * Topic: Recursion
 */

public class June2nd {

    public static void reverseString(char[] s) {
        helper(s, 0, s.length-1);
        System.out.println(Arrays.toString(s));
    }

    public static void helper(char[] s, int start, int end){

        if(start== s.length/2){
            return;
        }

        char temp= s[start];
        s[start]= s[end];
        s[end]= temp;

        helper(s, start+1, end-1);
    }


    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', '0'});
    }

}
