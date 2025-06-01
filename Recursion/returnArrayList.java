package Recursion;

import java.util.ArrayList;

public class returnArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        ArrayList<Integer> ans = findElementIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList findElementIndex(int[] arr, int target, int idx, ArrayList<Integer> list){
        if(idx==arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }

        return findElementIndex(arr, target, idx + 1, list);
    }
}
