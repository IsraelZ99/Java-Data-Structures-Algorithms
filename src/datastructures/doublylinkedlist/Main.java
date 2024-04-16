package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        testAppend();
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
