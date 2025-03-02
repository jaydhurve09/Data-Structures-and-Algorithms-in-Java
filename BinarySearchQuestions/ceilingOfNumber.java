package BinarySearchQuestions;

//ceiling of a number, means the smallest number which is greater than the target element
// 1. What is the target?
// 2. Find the nos. greater than or equal to the target,
// 3. From which the smallest element is the answer.
class ceilingOfNumber {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 9, 14, 16, 18};
        int res = search(a, 4);
        System.out.println(res);
    }
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] >= target) {
                end = mid;  //if element is greater than or equal to target set end to mid, it could be the ans
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}