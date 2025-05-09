package Recursion;
import java.util.Scanner;

public class gridPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns respectively: ");
        int n= sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the numbers for "+n+" x "+m+" grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(paths(n, m)+" unique paths are there.\n");
    }

    static int paths(int n, int m){
        if(n == 1 || m == 1) return 1; //base case
        return paths(n, m-1) + paths(n-1, m);
    }
}
