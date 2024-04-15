package linkedlist;

public class Main {
    public static void main(String[] args) {
        testAppend();
        testRemoveLast();
    }

    public static void testPrepend() {

    }

    public static void testAppend() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        System.out.println("\n*** Print Linked List ***");
        myLinkedList.printLIst();

        System.out.println();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }

    public static void testRemoveLast() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        System.out.println("\n*** Print Linked List ***");
        myLinkedList.printLIst();

        System.out.println();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\n*** Removing the last items ***");
        // (2) items - Return 2 Nodes
        System.out.println(myLinkedList.removeLast().value);
        // (1) items - Return 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) items - Return null
        System.out.println(myLinkedList.removeLast());
    }

}
