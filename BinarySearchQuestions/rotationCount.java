package BinarySearchQuestions;

public class rotationCount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int rotations = countRotation(nums);
        System.out.println("No of rotations are: "+rotations);
    }

    static int countRotation(int[] nums){
        int pivot = findPivot(nums);
        if(pivot==-1){
            return 0;
        }
//        int start = 0;
//        int end = pivot;
//        while(start<end){
//            if(nums[start]<nums[start+1]){
//                start++;
//            }
//        }
//        return start+1;

//        Or Array is rotated pivot times
        return pivot + 1;
    }

    static int findPivot(int[] arr){
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
