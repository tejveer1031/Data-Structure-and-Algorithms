package Algorithm;
// write two function to find factorial of given number
public class fsctorial {

   static int  sum = 1, previous_values = 0;

    public static void factorial(int n){
        sum = n;

        for(int i = n; i > 1; i--) {
            previous_values = sum * (i - 1) ;
            sum = previous_values;
        }
        System.out.print(previous_values);
    }
    public static int factorial2(int n){

        if(n == 1){
            return sum;
        }

        return  n * factorial2(n-1);
    }
}
