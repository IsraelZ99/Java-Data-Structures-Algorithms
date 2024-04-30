package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {

    /**
     * Merge method, to compare two array to check every index
     * to order descendant, and join into one array
     * @param array1 The first array wants to compare and join with the second one
     * @param array2 The second array wants to compare and join with the first one
     * @return The arrays order and together
     */
    public static int[] merge(int[] array1, int[] array2) {
        // Set combined as empty array with length of array1 + array2
        int[] combined = new int[array1.length + array2.length];
        // The total length of the combined array
        int index = 0;
        // Auxiliary to count if all the items of the array1 were iterate
        int i = 0;
        // Auxiliary to count if all the items of the array2 were iterate
        int j = 0;
        // While loop, until the auxiliary "i" will be less than length of array1
        // and, until the auxiliary "j" will be less than length of array2
        while (i < array1.length && j < array2.length) {
            // Check if the item at the index "i" about the array1 is less than array2 at
            // the index "j", to put it in combined array
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                i++;
            }
            // Otherwise put the item at the index "j" in combined array
            else {
                combined[index] = array2[j];
                j++;
            }
            index++;
        }
        // While loop: to put leftover items in array1 in to combined array
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        // While loop: to put leftover items in array2 in to combined array
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }

    /**
     * Recursive method to split the array a half over and over again
     * until on to the call stack will be one by one item as array
     * to after join and order with the merge method
     * @param array The array will be order
     * @return The array in order
     */
    public static int[] mergeSort(int[] array) {
        // Base case: Check if the length of the array is equals 1
        // at this point the call stack will pop one by one call
        if (array.length == 1) return array;
        // The middle number of the array
        int midIndex = array.length / 2;
        // Set left array to save the items on the left side in order
        // from the index 0 to middle -1, such a way recursive
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        // Set right array to save the items on the left side in order
        // from the index middle to length -1, such a way recursive
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        // Return the array in order
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 3, 7, 8, 2, 4, 5};
        int[] sortedArray = mergeSort(originalArray);
        System.out.println("\nOriginal Array: " + Arrays.toString(originalArray));
        System.out.println("\nSorted Array: " + Arrays.toString(mergeSort(sortedArray)));
    }
}
