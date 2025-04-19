package Recursion;

//Find the nth Fibonacci no.

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
