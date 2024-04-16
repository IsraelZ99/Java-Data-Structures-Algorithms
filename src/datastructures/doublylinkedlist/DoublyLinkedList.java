package datastructures.doublylinkedlist;

class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    /**
     * The constructor create a node by default
     * Also set head and tail to the node
     * Set the length to one
     *
     * @param value it's the value/number of the node
     */
    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * Insert node at the end of the list
     * @param value it's the value/number of the node
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            // Set head to point new node
            head = newNode;
            // Set tail to point new node
            tail = newNode;
        } else {
            // Set tail, to point to the new node
            tail.next = newNode;
            // Set new node to point to the current tail (before the inserting)
            newNode.prev = tail;
            // Set tail point to new Node
            tail = newNode;
        }
        length++;
    }

    /**
     * Remove the last item of the list
     * @return the node that was deleted
     */
    public Node removeLast() {
        if (length == 0) return null;
        // Set temp to point to tail
        Node temp = tail;
        // Check if in the list is one item
        if (length == 1) {
            tail = null;
            head = null;
        } else {
            // Set tail to point to the previous node
            tail = tail.prev;
            // Set tail no point to null, to unlink the last node
            tail.next = null;
            // Set temp previous property to point to null, because unlink the last node
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
