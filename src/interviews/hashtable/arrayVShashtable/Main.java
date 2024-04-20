package interviews.hashtable.arrayVShashtable;

import java.util.HashMap;

public class Main {
    /*
    You have two arrays that have tree items in each one:
        array1: 1,3,5
        array2: 2,4,5
     The objective is to see if the two arrays have an item
     in common
     */

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.print("Have the arrays item in common? ");
        // System.out.println(itemInCommonInefficient(array1, array2));
        System.out.println(itemInCommonEfficient(array1, array2));
    }

    // This option is more efficient, because even this has two for loops,
    // these aren't nested. And this is good because the operation are
    // O(2n) => The drop constant enter and this is going to be O(n)
    // O(n) vs O(n^2), O(n) is more efficient.
    public static boolean itemInCommonEfficient(int[] array1, int[] array2) {
        // We start with hash table, hash map is a hash table
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        // Loop inside the array1
        for (int i : array1) {
            // Put the value from each item in the array
            // Set the value with true, to after return it
            myHashMap.put(i, true);
        }

        // Loop inside the array2
        for (int j : array2) {
            // Check if "j" is in out hash map as a key
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }

    // This option is inefficient, because uses nested for loops to compare the arrays
    // This is O(n^2)
    public static boolean itemInCommonInefficient(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }
}
