package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if(n<=1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
