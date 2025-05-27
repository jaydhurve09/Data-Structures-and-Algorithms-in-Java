package InterviewQuestions;

import java.util.Arrays;

//given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
//The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

// Input: digits = [1,2,3]
// Output: [1,2,4]
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusone(arr)));;
    }

    static int[] plusone(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        //if all digits were 9
        int[] newNum = new int[n+1];
        newNum[0]=1;
        return newNum;
    }

}
