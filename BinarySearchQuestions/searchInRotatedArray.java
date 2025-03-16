package BinarySearchQuestions;

public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findPivot(nums));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if pivot not found that means the array is not rotated.
        if(pivot==-1) {
            return binarySearch(nums, target, 0, nums.length-1);
        }

        //if pivot is found, means we have two asc arrays
        if(nums[pivot] == target) {
            return pivot;
        } else if(target>=nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        } else {
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }

    static int binarySearch(int arr[], int target, int start, int end){
        while(start<=end)  //because it will iterate till both are same, means no element is found
        {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                return mid;         //if mid is same as target, target found.
            } else if (arr[mid]<target) {   //if element at mid position is smaller, then change start to next of mid
                start = mid +1;
            } else if (arr[mid]>target) {   //if greater then right should shifted to previous element of mid
                end = mid -1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(mid < end && arr[mid]>arr[mid+1]) {  //mid<end check for avoid index out of bounds in mid+1
                return mid;
            }
            else if(mid > start && arr[mid]<arr[mid-1]) {  //mid>start check for avoid index out of bounds in mid-1
                return mid-1;
            }
            else if(arr[mid]<=arr[start]) {  //check if first element is greater than mid, if it is then it's in asc order, so ignore it.
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


