package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        //testAppend();
        testRemoveLast();
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
