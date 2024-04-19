package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
//        testConstructor();
        testSet();
    }

    public static void testSet() {
        HashTable myHashTable = new HashTable();

        System.out.println("*** Adding key-value pairs to the hash table ***");
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        System.out.println("\n *** Print the hash table ***");
        myHashTable.printTable();

    }

    public static void testConstructor() {
        HashTable myHashTable = new HashTable();

        myHashTable.printTable();
    }
}
