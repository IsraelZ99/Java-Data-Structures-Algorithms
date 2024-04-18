package datastructures.binarysearchtree;

class BinarySearchTree {
    //The root node of the Tree
    // This normally is private
    Node root;

    /**
     * Insert new node on to the Tree
     * @param value it's the value/number og the node
     * @return If the new node was insert or not
     */
    public boolean insert(int value) {
        Node newNode = new Node(value);
        // Check if the tree is empty
        if (root == null) {
            root = newNode;
            return true;
        }
        // Set temp to point to the root node
        Node temp = root;
        while (true) {
            // This check if the new node has the same value of the temp node
            // temp node is changing
            if (newNode.value == temp.value) return false;
            // Check if new node is less than temp, if it's correct the new node
            // is going to be on the left side
            if (newNode.value < temp.value) {
                // Check if the spot is open, that means is not node on this position
                if (temp.left == null) {
                    // Link the new Node with the left arrow of temp node
                    // In other words, set left property to point to new node
                    temp.left = newNode;
                    return true;
                }
                // If the spot isn't open, set temp to point to the left side of the node
                temp = temp.left;
            }
            // If the new node is greater than temp the new node is going to be
            // on the right side
            else {
                // Check if the spot is open, that means is not node on this position
                if (temp.right == null) {
                    // Link the new Node with the right arrow of temp node
                    // In other words, set right property to point to new node
                    temp.right = newNode;
                    return true;
                }
                // If the spot isn't open, set temp to point to the right side of the node
                temp = temp.right;
            }
        }
    }
}
