package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Merge {
public static void mergeArray(Integer[] arr1,Integer[] arr2){//0(A+B) time complexity
    ArrayList NewArray = new ArrayList();
    for(int i : arr1){
        NewArray.add(i);
    }
    for (int i : arr2){
        NewArray.add(i);
    }

    System.out.println(NewArray);
}
    public static void mergeArray2(Integer[] arr1,Integer[] arr2){// 0(a+B)
       int lenghtArr1 = arr1.length;
       int lenghtArr2 = arr2.length;
       int finalLenghtArr = lenghtArr1 + lenghtArr2;
       Integer[] arr3 = new Integer[finalLenghtArr];
      for(int i = 0; i < lenghtArr1;i++){
            arr3[i] = arr1[i];

        }
        for(int j = 0 ; j < lenghtArr2;j++){
            arr3[lenghtArr1 + j] = arr2[j];
        }

        for(int i = 0 ; i < finalLenghtArr;i++){
          System.out.print(arr3[i]);
        }

    }
    public static void mergeArray3(Integer[] arr1,Integer[] arr2) {//0(n)
        int lenghtOfArray1 = arr1.length;
        int lengghtOfArray2 = arr2.length;
        int combineLenghtOfBothArray = lenghtOfArray1 + lengghtOfArray2;
        Integer[] arr3 = new Integer[combineLenghtOfBothArray];
        int k = 0,j = 0;
        for(int i = 0 ; i < combineLenghtOfBothArray;i++){
            if(k != lenghtOfArray1){
                arr3[i] = arr1[k];
                k++;
            }else{
                arr3[i] = arr2[j];
                j++;
            }
    }
        for(int i = 0 ; i < combineLenghtOfBothArray;i++){
            System.out.print(arr3[i]);
        }
    }
}
