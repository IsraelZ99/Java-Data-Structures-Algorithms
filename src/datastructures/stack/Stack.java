package datastructures.stack;

class Stack {
    private Node top;
    private int height;

    /**
     * The constructor create a new node by default
     * Set top, to point to the Node
     * Set height to 1
     * @param value it's the value/number of the node
     */
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
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
