package Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {     //size will be n
            if (list.get(i) == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not present in the ArrayList");

    }
}
