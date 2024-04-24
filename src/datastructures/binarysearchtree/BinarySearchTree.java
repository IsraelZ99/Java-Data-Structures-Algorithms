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
     * Recursive method to insert new node in the tree
     *
     * @param currentNode The node which is going used to compare the new value.
     *                    Doing this, is to know if the new node is going to be
     *                    on the left side or right side
     * @param value       The value/number to insert in the tree
     * @return The last node, which will be the root at the end
     * On the other hand, will return the node which was compared the new value
     */
    private Node rInsert(Node currentNode, int value) {
        // Check if the node is null
        // This means, the recursive method reach an empty space to insert the new node
        if (currentNode == null) return new Node(value);

        // Check if the value is less than the current node value
        // This means, that the new node is going to be inserted on the left side
        if (value < currentNode.value) {
            // Set current node left property to point to the return of
            // the rInsert new instance (recursive)
            // In this we pass the left node of the current node and the value we want to insert
            currentNode.left = rInsert(currentNode.left, value);
        }
        // Check if the value is greater than the current node value
        // This means, that the new node is going to be inserted on the right side
        else if (value > currentNode.value) {
            // Set current node right property to point to the return of
            // the rInsert new instance (recursive)
            // In this we pass the right node of the current node and the value we want to insert
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    /**
     * The overloading method that is call to insert new value on to the tree
     * This method call the rInsert method
     *
     * @param value The value/number to insert
     */
    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    /**
     * Recursive method to delete a node on to the tree by value
     *
     * @param currentNode The node which going to compare if the value looked up
     *                    is greater o less than
     * @param value       The value to delete on the tree
     * @return As recursion null if the node was found to unlink from the tree
     * If the node wasn't found will return null and the tree is going to be equals
     */
    private Node rDeleteNode(Node currentNode, int value) {
        // Check if the recursion will arrive to the finish of the tree
        // This means, the node to delete wasn't found
        if (currentNode == null) return null;

        // Check if the value to delete is less than the value of the current node
        if (value < currentNode.value) {
            // Create new instance of the rDeleteNode method
            // In this we pass the node that is on left side on the currentNode
            // and is going to assign to the left side
            currentNode.left = rDeleteNode(currentNode.left, value);
        }
        // Check if the value to delete is greater than the value of the current node
        else if (value > currentNode.value) {
            // Create new instance of the rDeleteNode method
            // In this we pass the node that is on right side on the currentNode
            // and is going to assign to the right side
            currentNode.right = rDeleteNode(currentNode.right, value);
        }
        // This means the value was found on the tree
        else {
            // Check if the founded node is a leaf (it hasn't nodes on the left and right side
            if (currentNode.left == null && currentNode.right == null) {
                // Unlink the founded node from the tree
                return null;
            }
            // Check if the founded node has one child on the right side, but not on the left side
            else if (currentNode.left == null) {
                // Set current node to point to the child on the right side
                currentNode = currentNode.right;
            }
            // Check if the founded node has one child on the left side, but not on the right side
            else if (currentNode.right == null) {
                // Set current node to point to the child on the left side
                currentNode = currentNode.left;
            }
            // The node have children on the right and left side
            // To delete node with 2 children, it's necessary store the minimum value
            // on the right side subtree, into the node with the same value looked up
            // and after delete this minimum value node
            else {
                // Set subTreeMin to store the minimum value that is on the right side of the current node
                int subTreeMin = minValue(currentNode.right);
                // Set current node value to now store the minimum value
                currentNode.value = subTreeMin;
                // Set current node, to now point to the node will be return after unlink the minimum node
                currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    /**
     * Find the minimum value on the tree
     *
     * @param currentNode The node where you want to start the find for minimum value
     * @return The minimum value
     */
    private int minValue(Node currentNode) {
        // On the left side always be the minimum value of the tree
        // While loop, until the node point to null on the left side
        // this means that we arrive at the end of the tree
        while (currentNode.left != null) {
            // Set current node, to point to the node on the left side
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void rDeleteNode(int value) {
        rDeleteNode(root, value);
    }

    /**
     * Recursive method to check if a value does exist on the tree
     *
     * @param currentNode The node which is going used to compare with the value looked up
     * @param value       The value/number to find out
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
     *
     * @param value The value/number to find out
     * @return If the value does exist on the tree
     */
    public boolean rContains(int value) {
        return rContains(root, value);
    }
}
