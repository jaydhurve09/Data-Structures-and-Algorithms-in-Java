package Arrays.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 9, 7};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 1; j<=arr.length - i - 1; j++){
                if(arr[j]<arr[j-1]){
                    swapElements(arr, j-1,j);
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
