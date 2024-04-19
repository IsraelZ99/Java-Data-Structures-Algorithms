package datastructures.hashtable;

class HashTable {

    // The size of the array using for the address space
    // I men, have 7 addresses from 0 to one (also call 7 indexes)
    private final int size = 7;

    // Array of pointer to nodes
    // This contains pointers to nodes
    private Node[] dataMap;

    /**
     * The constructor set the dataMap
     */
    public HashTable() {
        // Set dataMap to create an array which will be 7 size
        // Also we can pass the size directly instead of using variable
        dataMap = new Node[7];
    }

    /**
     * Print the hash table
     */
    public void printTable() {
        // For loop to iterate the hash table from the address 0 to the size (7 in this example)
        for (int iteration = 0; iteration < dataMap.length; iteration++) {
            System.out.println(iteration + ":");
            // Set temp, to point to the first node inside the index
            Node temp = dataMap[iteration];
            // While loop until temp will be null
            while (temp != null) {
                System.out.println("    {" + temp.key + "= " + temp.value + "}");
                // Set temp, to point to the next node, because next property
                temp = temp.next;
            }
        }
    }

}
