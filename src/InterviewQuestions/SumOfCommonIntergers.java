package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumOfCommonIntergers {

    public static  int Sum(Integer[] arr){//0(n^2) time complexicity
        int sum = 0;
        int currentElement = 0;
       for(int i = 0 ; i < arr.length;i++){
           for (int j = i+1 ; j < arr.length;j++){
               if(i != j && arr[i] == arr[j]){
                 sum =  arr[j]+ sum;
               }
           }
       }
        return sum;
    }
    public static void sum2(ArrayList<Integer> arr){//0(n)
        int sum = 0;
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer num1: arr) {
            if(!set1.add(num1)){
                sum = num1 + sum ;
            }
        }
System.out.println(sum);
    }

}
