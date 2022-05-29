package hashSet;

import java.util.HashSet;
import java.util.Set;

public class RecuuringChar {
    public static int recurring(int [] arr){
        Set list = new HashSet();

        int savedData = 0;
        for( int i : arr){
            if(!list.add(i)){
                savedData = i;
                break;
            }
        }
        return savedData;
    }
}
