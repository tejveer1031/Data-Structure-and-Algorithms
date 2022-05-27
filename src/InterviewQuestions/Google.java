package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

//Given 2 arrays , create a function that let user know (true/false) whether these two arrays contains any common items.
// for example :
//const array1 = ['a','b','c','x'];
//const array2 = ['z','y','i'];
//Should return false
//-------------
//const array1 = ['a','b','c','x'];
////const array2 = ['z','y','x'];
//should return true
//2 parameters - Arrays - no size limit
//Return True or False
public class Google {
    public static  boolean FindCommonIteams(Object[] array1, Object[] array2){
        //Create two hashsets and add elements from arrays to those sets
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();

        for (Object obj1: array1) {
            set1.add(obj1);
        }
        for (Object obj2: array2) {
            set2.add(obj2);
        }
        //after adding elemnts
        //Find the common elements in both the sets using Collection.retainAll() method.
        // This method keeps only the common elements of both Collection in Collection1.
        set1.retainAll(set2);
        System.out.println(set1);
        if(set1.isEmpty()){
            return false;
        }
        return true;
    }
}
//Time complexity 0(n)