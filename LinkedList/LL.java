package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int value) {
        if(tail == null) {
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int value, int index) {
        if (index == 0) {
            insertAtFirst(value);
            return;
        }
        if (index == size) {
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void deleteAt(int index) {
        if (index==0) {
            deleteFirst();
            return;
        }
        if (index == size-1) {
            deleteLast();
            return;
        }
        Node prev = getAtIdx(index - 1);
        prev.next = prev.next.next;
    }

    public void deleteFirst() {
        int value = head.value;
        head = head.next;
        // if there's only one element, and it's deleted head & tail will be null
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if(size <= 1) {
            deleteFirst();
            return;
        }
        Node secondLast = getAtIdx(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public Node find (int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node getAtIdx (int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
