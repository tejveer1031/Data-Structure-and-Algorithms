package Arrays;
//unsorted array
//data type - Arrays

public class RotateArray {


    public  static void rotateArray(int[] arr){//whole array

        int [] secondArray = new int[arr.length];
        int j = 0;
       for(int i = arr.length-1;i >= 0 ; i-- ){
           secondArray[j] = arr[i];
           j++;
       }

        for(int i = 0 ; i < secondArray.length;i++){
            System.out.print(secondArray[i]);
        }
    }

    public  static void rotateArray2(int[] arr) {

        int lastElement = 0;
        int element = 2;
        for (int i = 0;i < element;i++){
            lastElement = arr[arr.length-1];
            for(int j = arr.length-1;j > 0 ; j--){
               arr[j] = arr[j-1];
            }
                arr[0] = lastElement;
        }
        for(int k = 0 ; k < arr.length;k++){
            System.out.print(arr[k]);
        }

    }
    public  static void pushZer0(int[] arr) { //0(n)
        int count = 0;
        for(int i = 0; i < arr.length;i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }



        while (count < arr.length)
           arr[count++] = 0;




        for(int k = 0 ; k < arr.length;k++){
            System.out.print(arr[k]+"");
        }
    }

}
