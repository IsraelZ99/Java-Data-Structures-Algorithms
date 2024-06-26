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
     * Insert new node in specific index on the list
     *
     * @param index Index where you want insert the new node
     * @param value It's the number/value of the new node
     * @return If it's possible insert the node
     */
    public boolean insert(int index, int value) {
        if (index < 0 && index > length) return false;
        // If it's required to insert the new node at the beginning of the list
        // it's best use prepend method
        if (index == 0) {
            prepend(value);
            return true;
        }
        // If it's required to insert the new node at the end of the list
        // it's best use append method
        if (index == length) {
            append(value);
            return true;
        }
        // Set before, to point to the node that is 1 index before where you want to insert the new node
        Node before = get(index - 1);
        // It's best point after, to the next node of before, because this operation is O(1)
        // Instead we could use get method, but it is O(n)
        Node after = before.next;
        Node newNode = new Node(value);
        // Point the new node to the before node (previous property) = beforeNode <= newNode
        newNode.prev = before;
        // Point the new node to the after node (next property) = newNode => afterNode
        newNode.next = after;
        // Point the before node to the new node (next property) = beforeNode => newNode
        before.next = newNode;
        // Point the after node to the new node (previous property) = newNode <= afterNode
        after.prev = newNode;
        length++;
        return true;
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
     * Remove a node of the list
     * This is the best way of delete a node, because is more clean
     * @param index The index where the node is
     * @return The node that was deleted
     */
    public Node remove(int index) {
        if (index < 0 && index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        // Set temp to point to the node that is in the index
        Node temp = get(index);
        // This set the arrow of the next node that points to the temp node, to point to the previous node of the temp
        temp.next.prev = temp.prev;
        // This set the arrow of the previous node that points to the temp node, to point to the next node of the temp
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    /**
     * Remove a node of the list
     * This is one of the two implementations
     * This implementation uses the two-pointer
     *
     * @param index The index where the node is
     * @return The node that was deleted
     */
    public Node removeImplementationOne(int index) {
        if (index < 0 && index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        // Set temp to point to the node that is in the index
        Node temp = get(index);
        // Set before, to point 1 node before of the temp node
        Node before = temp.prev;
        // Set after, to point 1 node after of the temp node
        Node after = temp.next;
        // Set next property to point the "after" node
        before.next = after;
        // Set prev property to point the "before" node
        after.prev = before;
        // Unlink the node to delete correctly of the list
        temp.prev = null;
        temp.next = null;
        return temp;
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
