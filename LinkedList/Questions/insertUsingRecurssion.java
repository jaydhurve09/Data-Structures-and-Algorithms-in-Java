package LinkedList.Questions;

public class insertUsingRecurssion {
    public static void main(String[] args) {
       insertUsingRecurssion LL = new insertUsingRecurssion();
       LL.insertNodeAtEnd(3);
       LL.insertNodeAtEnd(5);
       LL.insertNodeAtEnd(9);
       LL.insertNodeAtEnd(1);
       LL.display();
    }

    public void insertRecurssion(int idx, int value) {
        Node node = new Node(value);
        if(head == null) {
            System.out.println("Empty List.");
            return;
        }
        int curIdx = 0;
        if(idx == 0) {
            node.next = head;
            head = node;
            return;
        }
        if (curIdx == idx-1) {

        }
    }

    private Node head;
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertNodeAtEnd (int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    public void display() {
        if (head == null) {
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
}
