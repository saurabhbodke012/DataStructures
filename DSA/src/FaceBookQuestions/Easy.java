package FaceBookQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Easy {

    public static String removeDuplicates(String s) {
        String[] str= s.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str));

        String listString="";
        int index=0;

        for(int i=1; i<strList.size(); i++){

            if(strList.get(i).equalsIgnoreCase(strList.get(index))){
                strList.remove(i);
                strList.remove(index);
                i=0;
                index= -1;
            }

            index++;

        }

        listString = listString + strList;

        return listString;
    }

    public static void main(String[] args) {
        String s= "azxxzy";

        System.out.println(removeDuplicates(s));
    }

}
