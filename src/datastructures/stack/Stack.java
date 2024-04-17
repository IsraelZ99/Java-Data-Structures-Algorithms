package datastructures.stack;

class Stack {
    private Node top;
    private int height;

    /**
     * The constructor create a new node by default
     * Set top, to point to the Node
     * Set height to 1
     *
     * @param value it's the value/number of the node
     */
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    /**
     * Insert new node in the stack
     * - Remember that when you insert in a stack, the new node is added
     *   to the top (at the start) of the stack
     * @param value it's the value/number of the node
     */
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }
}
