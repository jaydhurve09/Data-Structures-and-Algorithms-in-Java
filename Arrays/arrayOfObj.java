package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class arrayOfObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array of objects
        String[] str = new String[5];
//        str[0] = "Hello";
//        str[1] = "hi";
//        str[2] = "how";
//        str[3] = "are";
//        str[4] = "you?";


        System.out.print("Enter elements of array: ");
        for (int i = 0; i < 5; i++) {
            str[i] = sc.next();
        }

        System.out.print("Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
