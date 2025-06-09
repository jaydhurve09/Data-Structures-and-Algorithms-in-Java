package LinkedList;

public class DLL {
    private Node head;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;       //to avoid nullPointerException
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        last = node;
    }

    public  void insertAtIdx (int value, int index) {
        Node P = findAtIdx(index);
        Node node = new Node(value);
        if (P.prev != null) {
            P.prev.next = node;
            node.prev = P.prev;
        }
        node.next = P;
        P.prev = node;
    }

    public Node findAtIdx (int index) {
        Node node = head;
        int idx = 0;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Display Reverse: ");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
