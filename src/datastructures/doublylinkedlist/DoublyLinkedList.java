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
     * Set node value at specific index
     *
     * @param index Index where is the node
     * @param value New value of the node
     * @return If the node was set or not
     */
    public boolean set(int index, int value) {
        // Set temp to point to the node founded
        Node temp = get(index);
        // Compare if the temp is pointing to a node
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    /**
     * Get a node by index.
     * To do this, compare if the index that you want to search is in the first half
     * or in the second half to do this seek more efficiently
     *
     * @param index Index that you want search
     * @return The entire node
     */
    public Node get(int index) {
        if (index < 0 && index >= length) return null;
        // Point temp to the start of the list
        Node temp = head;
        // Compare if the index to get is in the first half
        if (index < length / 2) {
            // Iterate the list from left to right
            for (int iteration = 0; iteration < index; iteration++) {
                temp = temp.next;
            }
        } else {
            // Set temp to point to the end of the list
            temp = tail;
            // Iterate the list from right to left
            for (int iteration = length - 1; iteration > index; iteration--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    /**
     * Insert node at the end of the list
     *
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
     * Insert node at the end of the list
     *
     * @param value it's the value/number of the node
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            // Set head to point to the new node
            head = newNode;
            // Set tail to point to the new node
            tail = newNode;
        } else {
            // Set the new node to point to the current head (before inserting)
            newNode.next = head;
            // Set the head previous property, to point to the new node
            head.prev = newNode;
            // Set head to point to the new node
            head = newNode;
        }
        length++;
    }

    /**
     * Remove the first item of the list
     *
     * @return the node that was deleted
     */
    public Node removeFirst() {
        if (length == 0) return null;
        // Set temp node to point head
        Node temp = head;
        // Disassociated head and tail
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            // Set head, to point to the node after this (now the next node is head)
            head = head.next;
            // Set head previous property to point to null (to disassociate the ex-first node)
            head.prev = null;
            // Set temp to point to nothing
            temp.next = null;
        }
        length--;
        return temp;
    }

    /**
     * Remove the last item of the list
     *
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
