package String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseString {
    public static void reverse(String str){
        String str2 = "";
        //check input
        char ch;
        if(str.length() > 2){
            for(int i = str.length()-1; i >= 0 ;i--){
                ch = str.charAt(i);
                str2 =  str2 + ch  ;
            }
        }
                System.out.println(str2);
    }
    public static void reverse2(String str){// Nicer way to do things
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2.reverse();
        System.out.println(str2);
    }
    public static void reverse3(String str){// change string to arrayList of string and do things in nicer way
        char[] hello = str.toCharArray();
        ArrayList str2 = new ArrayList();

          for (char i : hello){
            str2.add(i);
        }
        Collections.reverse(str2);
        ListIterator li = str2.listIterator();
        while (li.hasNext()){
            System.out.print(li.next());
        }

    }
}
