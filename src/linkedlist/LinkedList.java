package linkedlist;

class LinkedList {
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
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * Insert new node to the end of the linked list
     *
     * @param value it's the value/number of the node
     */
    public void append(int value) {
        Node newNode = new Node(value);
        // Check if the list is empty
        if (length == 0) {
            // Set head to point to newNode
            head = newNode;
            // Set tail to point to newNode
            tail = newNode;
        } else {
            // Point the actually last node, to the new Node
            tail.next = newNode;
            // Set the tail, to the new Node.
            // Thus, the new Node now is the tail
            tail = newNode;
        }
        length++;
    }

    /**
     * Insert new node at the start of the linked list
     *
     * @param value it's the value/number of the node
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        // Check if the list is empty
        if (length == 0) {
            // Set head to point to newNode
            head = newNode;
            // Set tail to point to newNode
            tail = newNode;
        } else {
            // Point the new Node to the actually head
            newNode.next = head;
            // Set head point to the new Node
            head = newNode;
        }
        length++;
    }

    /**
     * Remove the first Node of the list
     * @return the Node that it was deleted
     */
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        // Head is set point to the node that at present head is pointing
        head = head.next;
        // Set next to null, to point to nothing
        temp.next = null;
        length--;
        // This if statement is used when the Linked List has only one item
        // This is because tail it didn't set to null
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    /**
     * Remove the last Node of the list
     *
     * @return the Node that it was deleted
     */
    public Node removeLast() {
        if (length == 0) return null;
        // Point temp to the head
        Node temp = head;
        // Point pre to the head
        Node pre = head;
        // Check until the temp node it will be the last, because it doesn't point to
        // a node (is null)
        while (temp.next != null) {
            // Set pre to the temp node
            pre = temp;
            // Set temp to the Node that it point out
            temp = temp.next;
        }
        // Set tail to the pre (one node before from the last one)
        tail = pre;
        // Set next to null, to point to nothing
        tail.next = null;
        // Decreased the length
        length--;
        // This if statement is used when the Linked List has only one item
        // This is because it didn't enter to the while loop
        if (length == 0) {
            head = null;
            tail = null;
        }
        // Return the Node that already was deleted from the Linked List
        return temp;
    }

    /**
     * This method iterate for all the Linked List, to do this:
     * Is important to remember that a Node have "value" and "next"
     * properties.
     * Value: It's the value(number) of the node have
     * Next: Point to the next Node or null if it's the tail node
     */
    public void printLIst() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
