package linkedlist;

public class Main {
    public static void main(String[] args) {
        testSet();
        // testGet();
        // testRemoveFirst();
        // testPrepend();
        // testAppend();
        // testRemoveLast();
    }

    public static void testSet() {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        System.out.println("*** Setting a node ***");
        System.out.println(myLinkedList.set(1, 4));

        System.out.println("\n*** Print Linked List ***");
        myLinkedList.printLIst();
    }

    public static void testGet() {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Getting a node");
        System.out.println(myLinkedList.get(2).value + "\n");

        System.out.println("\n*** Print Linked List ***");
        myLinkedList.printLIst();
    }

    public static void testRemoveFirst() {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        System.out.println("\n*** Print Linked List ***");
        myLinkedList.printLIst();

        System.out.println("\n*** Removing the last items ***");
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst());
    }

    public static void testPrepend() {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);

        myLinkedList.prepend(1);

        System.out.println("\n*** Print Linked List ***");
        myLinkedList.printLIst();
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
