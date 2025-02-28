package Arrays;
import java.util.Arrays;

public class linearSearch2 {
    public static void main(String[] args) {
        int arr[] = {1, 23, 54, 98, -11, 72};
        int target = -11;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    //search: if found return index
    //otherwise return not found -1
    static int search(int arr[], int target){
        //does not exist
        if(arr.length==0) return -1;

        //run a loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
//                System.out.println("Element found at index "+i);
                return i;
            }
        }
        return -1;
    }
}
