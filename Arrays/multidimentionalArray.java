package Arrays;

import java.util.Scanner;

public class multidimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2D array can be defined as arr[][]
        //Another way is:
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // no of cols can be variable and doesn't matter if we don't put it.
        // it can be like arr[3][] but not arr[][3]
        /*
        {
            {2, 3, 4},
            {5, 6},
            {8, 7, 9, 10}
        }
        */

//        int[][] nums = new int[3][3];
//        System.out.println("Enter elements of Array: ");
//        for (int i = 0; i < 3; i++) {   //for rows
//            for (int j = 0; j < 3; j++) {   //for cols
//                nums[i][j] = sc.nextInt();
//            }
//        }
//        printing array
        System.out.println("Array: ");
        for (int i = 0; i < nums.length; i++) {   //for rows
            for (int j = 0; j < nums.length; j++) {   //for cols
                System.out.println(nums[i][j]+" ");
            }
        }
//        System.out.println(nums[2][0]); //->will print element from 3rd row and 1st column
    }
}
