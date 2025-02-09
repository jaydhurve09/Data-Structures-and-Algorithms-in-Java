package Arrays;
//import java.util.Scanner;
import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int[] nums = {2, 76, 4, 7, 32, 3};       //defined the array
        int len = nums.length;
//        printing the array
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));      //after change
        //This shows that arrays in Java are mutable and Strings are immutable
    }

    static void change(int[] arr){
        arr[0] = 12;
    }
}
