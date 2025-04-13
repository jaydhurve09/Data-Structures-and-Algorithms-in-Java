package Arrays.Sorting;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {4, 1, -3, 9, 7};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swapElements(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swapElements(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
