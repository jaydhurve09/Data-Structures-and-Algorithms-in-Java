package Arrays;
import java.util.Arrays;

// i/p: nums = [1, 1, 2, 2, 3]
// o/p: 2, nums = [1, 2, 3, _, _]

//Check if curEle == nextEle => continue
//if curEle != nextEle => count++, set nums[count] = nums[i]
//iterate till last second element (i=0; i<nums.length-1; i++)

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length-1 && nums[i] == nums[i+1]) {
                continue;
            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
