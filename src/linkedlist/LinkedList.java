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
     * Set the value of a specific node
     *
     * @param index Index of the node
     * @param value New value of the node
     * @return If it was possible to set the node
     */
    public boolean set(int index, int value) {
        // Set temp to pointing to the node
        Node temp = get(index);
        if (temp != null) {
            // Setting the value of the pointing node
            temp.value = value;
            return true;
        }
        return false;
    }

    /**
     * Get a node by index
     *
     * @param index Index that you want search
     * @return The entire node
     */
    public Node get(int index) {
        // Check if that the index doesn't is out range
        if (index < 0 || index >= length) return null;
        // Create variable to start the search of the index from head
        Node temp = head;
        for (int iteration = 0; iteration < index; iteration++) {
            // Set temp to the next node that is pointing
            temp = temp.next;
        }
        return temp;
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
     * @param value It's the value/number of the node
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
     * Insert new node at a particular index
     *
     * @param index Index where the node will insert
     * @param value It's the value/number of the node
     * @return If it was possible to insert the node
     */
    public boolean insert(int index, int value) {
        // Check if that the index doesn't is out range
        if (index < 0 || index >= length) return false;
        // If it is necessary insert the node at the beginning, uses prepend method
        if (index == 0) {
            prepend(value);
            return true;
        }
        // If it is necessary insert the node at the end, uses append method
        if (index == length) {
            append(value);
            return true;
        }
        // Create the new node with the value
        Node newNode = new Node(value);
        // Set temp node to point to the 1 index before the new will be inserting
        Node temp = get(index - 1);
        // Set new node, to point to the node that it is in the index where the new will be inserting
        newNode.next = temp.next;
        // Set temp nod, to point to the new node
        temp.next = newNode;
        length++;
        return true;
    }

    /**
     * Remove the first Node of the list
     *
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
