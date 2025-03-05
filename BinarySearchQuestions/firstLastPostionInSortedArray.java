package BinarySearchQuestions;

//Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].

//we simply have to find first and last occurrence of the target

//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]

import java.util.Arrays;

public class firstLastPostionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    //this method returns an integer array
    public static int[] searchRange(int[] nums, int target) {
        //this func does not contain binary search code because me may have to run binary search twice,
        // to find first and last element
        int[] res = {-1, -1};   //by default, res array will return [-1, -1]
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        res[0] = start;         //set first index to start
        if (res[0]!=-1) {   //if first occurrence not found means target is not present, so not point in finding end occurrence
            res[1] = end;   //set last index as end
        }
        return res;
    }

    //we also use a boolean value to check if we are searching for start or end.
    //rest is just normal binary search code.
    static int search(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int res = -1;      //by default, it will return -1, which means not found.
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(nums[mid]==target){  //this condition is imp. if mid matches target,
                // then check if we are searching for start or end
                res = mid;  //potential ans

                if (findStartIndex) {   //if finding start
                    end = mid -1;   //means we are trying to find first occurrence of target. end is set to previous of mid.
                } else {
                    start = mid + 1;    //means we are trying to find last occurrence of target. start is set to next of mid.
                }
            } else if (nums[mid]<target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
