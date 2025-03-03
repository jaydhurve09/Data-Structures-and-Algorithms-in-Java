package BinarySearchQuestions;
//floor of a number is the largest number smaller than or equal to the target
// 1. What is the target?
// 2. Find nos. that are smaller and equal to target.
// 3. Find the largest out of them.

public class floorOfNumber {
    public static void main(String[] args) {
        floorOfNumber obj = new floorOfNumber();      //obj to access no-static methods in the class
        int a[] = {2, 3, 5, 9, 14, 16, 18};
        int res = obj.search(a, 10);            //search method called with arguments: array a, and target
        if(res==-1) System.out.println("Not found!");
        else System.out.println(res);
    }
    public int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){          //we use <= to avoid infinite loop
            int mid = start + (end-start) / 2;
            if(arr[mid]==target) {      //found target at mid index
                return arr[mid];
            } else if (arr[mid]<target) {
                start = mid+1;        //we are moving start to mid+1
            } else {                //if arr[mid]>target then end will be previous element of mid
                end = mid-1;
            }
        }
        return (end>=0) ? arr[end] : -1;        //returning end because it is largest of the smaller nos. than target
        //check condition when no. not found and end becomes less than start return -1
    }
}
