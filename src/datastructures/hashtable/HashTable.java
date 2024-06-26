package datastructures.hashtable;

import java.util.ArrayList;

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
     * Insert new node to specific address (index) on to the hash table
     *
     * @param key   String key, to save on to the hash table, and transform to hash
     * @param value it's the value/number
     */
    public void set(String key, int value) {
        // Set index to the hash number from the key
        int index = hash(key);
        Node newNode = new Node(key, value);
        // Check if in index is point to a node (exist any node)
        if (dataMap[index] == null) {
            // If there isn't node, point the index to the new node
            dataMap[index] = newNode;
        } else {
            // Point to the first node that is pointing the index on the hash table
            Node temp = dataMap[index];
            // While loop, until temp will arrive to the last node of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            // Set the last node of the list, to point to the new node
            temp.next = newNode;
        }
    }

    /**
     * The method to return the value as from specific key on to the hash table
     *
     * @param key The key to look up on to the hash table
     * @return The value of this key, in case of exists otherwise, return 0
     */
    public int get(String key) {
        // Set index to the hash number from the key
        int index = hash(key);
        // Set temp, to point to the first node that the index is pointing to
        Node temp = dataMap[index];
        // While loop, until temp will become the last node of the list
        while (temp != null) {
            // Check if the key of the current node is the same of the key search
            if (temp.key.equals(key)) return temp.value;
            // Otherwise set temp, to point to the next node of the list
            temp = temp.next;
        }
        return 0;
    }

    /**
     * Get all the keys in the hash table
     *
     * @return All the keys that exists in the hash table
     */
    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int iteration = 0; iteration < dataMap.length; iteration++) {
            // Set temp, to point to the first node that the index is pointing to
            Node temp = dataMap[iteration];
            // While loop, until temp will become the last node of the list
            while (temp != null) {
                // Add the key to the array list
                allKeys.add(temp.key);
                // Set temp, to point to the next node
                temp = temp.next;
            }
        }
        return allKeys;
    }

    /**
     * This convert key to hash
     *
     * @param key The key you want to convert
     * @return The hash
     */
    private int hash(String key) {
        int hash = 0;
        // This contains the key converted into char
        // For example, the string "hello" is going to
        // convert to "[h,e,l,l,o]"
        char[] keyChars = key.toCharArray();
        // Iterate all the key chars with a for loop
        for (int iteration = 0; iteration < keyChars.length; iteration++) {
            // This line is going to convert the char to the ascii number
            // according to the ascii table
            int asciiValue = keyChars[iteration];
            // The operation hash + asciiValue is going hash plus asciiValue according the ascii table
            // The reason of multiply for 23 is, this is a prime number
            //   - You can stick any prime number or leave the prime number out altogether
            // % dataMap.length = The reason of this because, the reminder of the operation
            // is going to have zero at the lowest and length - 1 as the highest number reminder
            // The equation is always going to return a number that is between
            // the address space (index => from 0 to the length - 1)
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        // Return a number between address space =>  zero to length - 1
        return hash;
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
