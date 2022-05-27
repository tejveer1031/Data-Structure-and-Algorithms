package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicate {
    public static <T> void arrayList(ArrayList<T> arr){
        Set<T> set1 = new LinkedHashSet<>();
            set1.addAll(arr);
        arr.clear();
        arr.addAll(set1);
        System.out.println(arr);
    }
}
