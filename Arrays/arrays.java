package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrays {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    //normally assining array
//    arr[0] = 15;
//    arr[1] = 7;
//    arr[2] = 32;
//    arr[3] = 891;
//    arr[4] = 55;
//    System.out.println(arr[3]);     //printing a single element of an array ds

    //Taking input

    System.out.print("Enter the elements of Array: ");
    for (int i=0; i<5; i++){
        arr[i] = sc.nextInt();
    }

    //printing using for loop
//    System.out.print("Array: ");
//    for (int i=0; i<5; i++){
//        System.out.print(arr[i]+" ");
//    }

    //directly printing using Arrays class method, toString()
    System.out.println(Arrays.toString(arr));
}   
}