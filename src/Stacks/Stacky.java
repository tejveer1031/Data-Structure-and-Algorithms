package Stacks;

public class Stacky {
    int size;
    int top;
    char[] a;

    public Stacky(int n) {
    }

    public Stacky() {

    }

    //function to check if stack is empty
    boolean isEmpty(){
        return  (top < 0);// it will return true if stack is not empty
    }

    void Stack(int n){
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("stack overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }
        char pop(){
            if(top < 0){
                System.out.println("stack underflow");
                return 0;
            }
            else{
                char x = a[top-1];
                return x;
            }
    }
    public static void reverse(StringBuffer str)
    {
        // Create a stack of capacity
        // equal to length of string
        int n = str.length();
        Stacky obj = new Stacky(n);

        // Push all characters of string
        // to stack
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        // Pop all characters of string
        // and put them back to str
        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            str.setCharAt(i,ch);
        }
    }

}
