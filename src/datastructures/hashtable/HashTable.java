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
