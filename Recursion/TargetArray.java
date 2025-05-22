package Recursion;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 5, 1};
        System.out.println(target(arr, 7, 0));
    }

    static int target(int[] arr, int target, int idx) {
        //base condition
        if (idx == arr.length)
            return -1;

        if (arr[idx] == target)
            return  idx;

        return target(arr, target, idx+1);
//        return arr[idx] == target || target(arr, target, idx+1);
    }
}
