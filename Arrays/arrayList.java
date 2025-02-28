package Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        //adding an element
//        list.add(7);
//        list.add(11);
//        list.add(19);
//        list.add(55);
//        list.add(74265);
//        list.add(98);

        //taking input
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get first element
        System.out.println(list.get(0));

        //printing the list
        System.out.println(list);

        //.contains
        System.out.println("Does it contains 19? "+list.contains(19));
    }
}
