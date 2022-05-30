package Algorithm;

public class Recursion {
    static int firstPointer=0,SecondPointer=1,sum=0;


    public static void fibonacci(long count) {
        if(count>0){
            sum = firstPointer + SecondPointer;
            firstPointer = SecondPointer;
            SecondPointer = sum;
            System.out.println(" "+sum);
            fibonacci(count-1);
        }


    }
    public static  void fibonacci2(long count){
        for(int i = (int) count; i > 0 ; i--){
            sum = firstPointer + SecondPointer;
            firstPointer = SecondPointer;
            SecondPointer = sum;
        }
        System.out.print(sum);
    }
}
