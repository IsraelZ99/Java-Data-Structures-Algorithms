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
