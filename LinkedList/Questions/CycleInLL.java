package LinkedList.Questions;

import LinkedList.Questions.List;

public class CycleInLL {
    List list = new List();

    //fast and slow approach
    //Detect the cycle
    public static boolean isCycle(List head) {
        List fast = head;
        List slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }

        return false;
    }


    // Length of the cycle
    public static int LengthCycle(List head) {
        List fast = head;
        List slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                List temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public List detectCycle(List head) {
        int length = 0;

        List fast = head;
        List slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = LengthCycle(slow);
                break;
            }
        }

        //if no cycle present
        if(length == 0) {
            return null;
        }

        //find the start
        List s = head;
        List f = head;

        while(length > 0) {
            s = s.next;
            length--;
        }

        // keep moving till both meet at start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
