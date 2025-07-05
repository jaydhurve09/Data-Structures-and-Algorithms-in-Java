package LinkedList.Questions;

public class List {
    int val;
    List next;

    public static void main(String[] args) {
        List ll = new List();
    }

    List(int x) {
        this.val = x;
        this.next = null;
    }
    List() {}
    List(int val, List next) {
        this.val = val;
        this.next = next;
    }
}

