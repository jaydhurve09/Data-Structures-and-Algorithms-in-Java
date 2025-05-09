package Recursion;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum till "+n+" = "+sum(n));
    }

    static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1) + n;
    }
}
