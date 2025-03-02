package Arrays;
import java.util.Arrays;

public class binarySerach {
    public static void main(String[] args) {
        int arr[] = {12, 13, 15, 17, 19};
        int res = search(arr, 14);
        if(res == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Element found at index "+res);
        }
    }

    static int search(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right)  //because it will iterate till both are same, means no element is found
        {
            int mid = (left + right)/2;
            if (arr[mid]==target) {
                return mid;         //if mid is same as target, target found.
            } else if (arr[mid]<target) {   //if element at mid position is smaller, then change left to next of mid
                left = mid +1;
            } else if (arr[mid]>target) {   //if greater then right should shifted to previous element of mid
                right = mid -1;
            }
        }
        return -1;
    }
}
