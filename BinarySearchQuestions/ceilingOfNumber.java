package BinarySearchQuestions;

//ceiling of a number, means the smallest number which is greater than the target element
// 1. What is the target?
// 2. Find the nos. greater than or equal to the target,
// 3. From which the smallest element is the answer.
class ceilingOfNumber {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 9, 14, 16, 18};
        int res = search(a, 15);
        System.out.println(res);
    }
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] == target) return arr[mid];
            else if(arr[mid] < target) {
                start = mid + 1;  //if element is less than to target set start to next of mid, it could be the ans
            } else {
                end = mid - 1;  //if element at mid is greater than target set end to element before mid
            }
        }
        return arr[start];  //start points to the ceiling
    }
}