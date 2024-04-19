package datastructures.hashtable;

// This will be the key-value pair that will be inserted
// on specific address space.
// Point to note: This has next property because this will
// be implemented as linked list inside of address to store more than one node
class Node {
    // The key of the key-value pair
    String key;
    // The value of the key-value pair
    int value;
    // Uses to point to a node
    Node next;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
