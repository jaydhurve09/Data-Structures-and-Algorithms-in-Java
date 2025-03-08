package BinarySearchQuestions;

// Infinite array means we don't know the size of the array
public class infiniteArrayElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 10, 15, 20, 25, 30, 35, 40, 50, 60, 70, 80, 90}; // Simulating an infinite array
        int target = 10;
        int result = findTarget(arr, target);
        System.out.println("Target found at index: " + result);
    }

    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the search range exponentially
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;

            // Ensure `end` does not go out of bounds
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }

            start = newStart;
        }

        // Perform binary search within the found range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } //
        return -1;  // Target not found
    }
}
