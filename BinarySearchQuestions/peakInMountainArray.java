package BinarySearchQuestions;

public class peakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        int res = search(arr);
        System.out.println("Peak index is: "+res);
    }
    static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start<end) {
            int mid = start + (end-start) / 2;
            if (nums[mid]>nums[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
            //when start and end are equal that means we've found the peak so return it.
            return start;
        }
        return -1;
    }
}
