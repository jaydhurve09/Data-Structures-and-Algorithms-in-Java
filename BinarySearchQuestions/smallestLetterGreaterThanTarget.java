package BinarySearchQuestions;

//This is the same as ceiling of a number problem.
//But only difference is that we check greater and equal to, here we want only greater o/p not equal.
//so in case: {"c", "f", "j"}, target: "c"
//o/p should be "f"

public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'l'};
        char res = nextGreatestLetter(letters, 'd');
        //if target was 'c', it should not return 'c' it should return 'f', if 'f' was the target then it must return 'j'
        //it must always give greatest, even if it is equal to target.
        System.out.println(res);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            //if I use if(letters[mid]<target), the o/p will be "c". But we want o/p as "f".
            // This incorrectly includes letters[mid] == target inside the else condition.
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {   //so, if(letters[mid]<=target) is correct approach.
                // By doing this letters[mid] == target also stays in if block and start sets to mid+1.
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
        //And letters[start%letters.length] ensures that even if start is greater than or equal to letters.length, it wraps around.
        // Which means it returns the start. If not used than ArrayIndexOutOfBounds Exception
    }
}
