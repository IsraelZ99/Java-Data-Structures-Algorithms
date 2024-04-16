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
        if (index < 0 || index > length) return false;
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
     * Remove node from the list
     *
     * @param index Index where the node what will be deleted is
     * @return The node that already was deleted
     */
    public Node remove(int index) {
        // Check if that the index doesn't is out range
        if (index < 0 || index >= length) return null;
        // If it is necessary delete the node at the beginning, uses remove first method
        if (index == 0) return removeFirst();
        // If it is necessary delete the node at the end, uses remove last method
        if (index == length - 1) return removeLast();
        // Get the before node where is the node will be deleting
        Node prev = get(index - 1);
        // Set temp node to point to the node after the one to be deleted
        Node temp = prev.next;
        // Set prev node, to point to next node that the node will be deleting pointed
        prev.next = temp.next;
        // Set next to null, to point to nothing
        temp.next = null;
        length--;
        return temp;
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
     * Reverse the linked list, I mean, the linked list will be inverting
     */
    public void reverse() {
        // Set temp to point the head now
        Node temp = head;
        // Reverse: Now point the head to tail
        head = tail;
        // Now point the tail to temp node
        tail = temp;
        // Create node to after point the after node of temp
        Node after;
        // Create node to point nothing, this node will be before temp
        Node before = null;
        for (int iteration = 0; iteration < length; iteration++) {
            // Set after, to point the next node in the current order
            after = temp.next;
            // Point temp node to before node (in this start the reverse)
            temp.next = before;
            // Set before, to point to the temp node
            before = temp;
            // Set temp, to point the after node
            temp = after;
        }
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

    /**
     * Find the middle node in Array List
     * @return The middle node
     */
    public Node findMiddleNode() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * Check if the list has loop => It doesn't have an ending
     * @return If the list has loop
     */
    public boolean hasLoop() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    /**
     * Find the kth end of the list, I mean the "k" node number from the end to the start
     * @param k The node number
     * @return The node
     */
    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;
        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
