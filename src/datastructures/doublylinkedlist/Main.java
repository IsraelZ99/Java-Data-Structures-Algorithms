package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        // testAppend();
        // testRemoveLast();
        // testPrepend();
        // testRemoveFirst();
        // testGet();
        testSet();
    }

    public static void testSet() {
        DoublyLinkedList myDLL = new DoublyLinkedList(11);
        myDLL.append(3);
        myDLL.append(23);
        myDLL.append(7);

        System.out.println("*** Set item ***");
        System.out.println(myDLL.set(1, 4));

        System.out.println("\n*** Print the list ***");
        myDLL.printList();
    }

    public static void testGet() {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);

        System.out.println("*** Getting nodes ***");
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(2).value);

        System.out.println("\n*** Print the list ***");
        myDLL.printList();
    }

    public static void testRemoveFirst() {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(1);

        System.out.println("*** Print the list ***");
        myDLL.printList();

        System.out.println("\n*** Removing nodes ***");
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());
    }

    public static void testPrepend() {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);

        myDLL.prepend(1);

        System.out.println("*** Print the list ***");
        myDLL.printList();
    }

    public static void testRemoveLast() {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        System.out.println("*** Print the list ***");
        myDLL.printList();

        System.out.println("\n*** Removing nodes ***");
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());
    }

    public static void testAppend() {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.printList();
    }

    public static void testConstructor() {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();
    }

}
