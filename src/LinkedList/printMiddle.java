package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class printMiddle {
    public static void printmiddile(LinkedList arr){
                for(int i = 0; i < arr.size();i++){
                    if(arr.get(i) == arr.get(arr.size() / 2)){
                        System.out.println(arr.get(i));
                        break;
                    }
                }
    }

}
