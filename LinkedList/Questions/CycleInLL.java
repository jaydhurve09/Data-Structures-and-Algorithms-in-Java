package LinkedList.Questions;

import LinkedList.Questions.List;

public class CycleInLL {
    List list = new List();

    //fast and slow approach
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
}
