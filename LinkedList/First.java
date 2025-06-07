package LinkedList;

public class First {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(23);
        list.insertAtFirst(12);
        list.insertAtFirst(9);
        list.insertAtLast(30);
        list.insertAtLast(7);
        list.insertAt(100, 2);
        System.out.println("Original:");
        list.display();
        System.out.println("Delete First:");
        list.deleteFirst();
        list.display();
        System.out.println("Delete Last:");
        list.deleteLast();
        list.display();
        System.out.println("Delete At: index 2");
        list.deleteAt(2);
        list.display();
    }
}
