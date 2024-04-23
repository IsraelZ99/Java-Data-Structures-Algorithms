package datastructures.binarysearchtree;

class BinarySearchTree {
    //The root node of the Tree
    // This normally is private
    Node root;

    /**
     * Insert new node on to the Tree
     *
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

    /**
     * Remove node from the tree
     *
     * @param value it's the value/number to find and delete
     * @return If the node was deleted
     */
    // TODO: Finish remove method with all cases
    public boolean remove(int value) {
        // Check if the tree is empty
        if (root == null) return false;
        // Set temp to point root
        Node temp = root;
        while (true) {
            // Check if the value is less than the value of the temp node
            if (value < temp.value) {
                // Check if the left side of the temp node is empty
                if (temp.left == null) return false;
                // Check if value and the node is on the left side of temp are equals
                if (value == temp.left.value) {
                    // Set left side of temp to null, to unlink the node
                    temp.left = null;
                    return true;
                }
                // Set temp to point to the node on the left side
                temp = temp.left;
            }
            // Check if the value is greater than the value of the temp node
            else {
                // Check if the tight side of the temp node is empty
                if (temp.right == null) return false;
                // Check if value and the node is on the right side of temp are equals
                if (value == temp.right.value) {
                    // Set right side of temp to null, to unlink the node
                    temp.right = null;
                    return true;
                }
                // Set temp to point to the node on the right side
                temp = temp.right;
            }
        }
    }

    /**
     * Look up a value on the tree
     *
     * @param value The value/number to find out
     * @return If the value was found or not
     */
    public boolean contains(int value) {
        // Check if the tree is empty
        // This line can comment out, because the next flow works if the
        // tree is empty too
        // if (root == null) return false;

        // Set temp to point root
        Node temp = root;
        // While temp is not null, can enter to the loop
        while (temp != null) {
            // Check if the value is less than temp value
            if (value < temp.value) {
                // Set temp to now point to the left side
                temp = temp.left;
            }
            // Check if the value is greater than temp value
            else if (value > temp.value) {
                // Set temp to now point to the right side
                temp = temp.right;
            }
            // If the value was found
            else {
                return true;
            }
        }
        // If the value was not found, return false
        return false;
    }

    /**
     * Recursive method to check if a value does exist on the tree
     * @param currentNode The node which is going used to compare with the value looked up
     * @param value The value/number to find out
     * @return If the value exists on the tree
     */
    private boolean rContains(Node currentNode, int value) {
        // Check if the node is null
        // This means, or doesn't exist the value on the tree or the tree is empty
        if (currentNode == null) return false;
        // Check if the value of the node is equals of the value looked up
        if (currentNode.value == value) return true;

        // Check if the value looked up is less than the current node
        // This, to know if the search is going to continue on the left side
        if (value < currentNode.value) {
            // Create new instance of the rContains method
            // In this we pass the node that is on left side on the currentNode
            return rContains(currentNode.left, value);
        }
        // If the value looked up is greater than the current node
        // This, to know if the search is going to continue on the right side
        else {
            // Create new instance of the rContains method
            // In this we pass the node that is on right side on the currentNode
            return rContains(currentNode.right, value);
        }
    }

    /**
     * The overloading method that is call to check if the tree
     * contains specific value
     * This method call the rContains method
     * @param value The value/number to find out
     * @return If the value does exist on the tree
     */
    public boolean rContains(int value) {
        return rContains(root, value);
    }
}
