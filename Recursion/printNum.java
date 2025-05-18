package Recursion;

public class printNum {
    public static void main(String[] args) {
        int num = 5;
        printN(num);
    }
    //n-1
    static void printN(int n) {
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
        printN(n-1);
    }
}
