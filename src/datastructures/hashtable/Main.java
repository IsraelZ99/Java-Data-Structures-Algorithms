package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
//        testConstructor();
//        testSet();
//        testGet();
        testKeys();
    }

    public static void testKeys() {
        HashTable myHashTable = new HashTable();

        System.out.println("*** Adding key-value pairs to the hash table ***");
        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("*** Print all the keys");
        System.out.println(myHashTable.keys());
    }

    public static void testGet() {
        HashTable myHashTable = new HashTable();

        System.out.println("*** Adding key-value pairs to the hash table ***");
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("Getting the key value of lumber: " + myHashTable.get("lumber"));
        System.out.println("Getting the key value of bolts (doesn't exist): " + myHashTable.get("bolts"));

        System.out.println("\n *** Print the hash table ***");
        myHashTable.printTable();
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
