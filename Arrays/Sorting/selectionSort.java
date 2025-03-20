package Arrays.Sorting;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //find the max item in remaining array and swap
            int last = arr.length - i - 1;          //in first case, if length=5, 5-0-1=4, i++ = 0-> 1
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}


