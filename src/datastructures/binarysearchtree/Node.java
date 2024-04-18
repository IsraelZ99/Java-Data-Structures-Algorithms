package datastructures.binarysearchtree;

class Node {
    int value;
    // Node left (in this side is the number less than the parent)
    Node left;

    // Node right  (in this side is the number greater than the parent)
    Node right;

    public Node(int value) {
        this.value = value;
    }
}
