package datastructures.queue;

class Queue {
    private Node first;
    private Node last;
    private int length;

    /**
     * The constructor create a node ny default
     * Also set first and last to point to the new node
     * Set the length to one
     *
     * @param value it's the value/number of the node
     */
    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    /**
     * Enqueue a node on to the queue, for do this is important to remember:
     * - When you enqueue a node => it's the node at the end of the linked list
     * This operation is O(1)
     *
     * @param value it's the value/number of the node
     */
    public void enqueue(int value) {
        // Create new node
        Node newNode = new Node(value);
        // If the length of the Queue is empty, set first and last to point to the new node
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            // Set last (the last one node enter on to the Queue)
            // to point the next property to the new node
            last.next = newNode;
            // Set last, to point to the new node
            last = newNode;
        }
        length++;
    }

    /**
     * Dequeue a node from the queue, for do this is important to remember:
     * - When you dequeue a node => it's the node at the start of the linked list
     * This operation is O(1)
     *
     * @return The node dequeued
     */
    public Node dequeue() {
        if (length == 0) return null;
        // Set temp, to point first (the first node that enter on the Queue)
        Node temp = first;
        // If the Queue is empty, set first and last to null (to free the queue)
        if (length == 1) {
            first = null;
            last = null;
        } else {
            // Set first to point to the node that is after that
            first = first.next;
            // Set next property of temp, to point to null
            // Unlink the node of the Queue
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
