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
     * to the top (at the start) of the stack
     *
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

    /**
     * Remove the last node enter on to the stack
     *  - Remember that when you remove, you can only do from the last item
     *    that enter on to the stack
     * @return The node was deleted
     */
    public Node pop() {
        if (height == 0) return null;
        // Set temp, to point to the top of the stack
        Node temp = top;
        // Set top, to point to the next node that is after of this
        top = top.next;
        // Set temp to null, to unlink from the stack
        temp.next = null;
        height--;
        return temp;
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
