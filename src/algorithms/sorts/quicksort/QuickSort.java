package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {

    /**
     * Swap to items on to the array, I mean, swap the first item at the first index
     * where the second item it is, and swap the second item where the first index
     * it is
     * @param array The entire array
     * @param firstIndex The index of the first item
     * @param secondIndex The index of the second item
     */
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    /**
     * Method to iterate the array from the pivot index + 1 to the end index,
     * break the array where from the left side will be fewer values and on the
     * right side greater values of the pivot
     * @param array The entire array
     * @param pivotIndex The pivot index which is going to compare with the
     *                   other items of the array
     * @param endIndex The index where the for lop is going to stop
     * @return The index where the pivot index was put, after relocate
     * the index less than on the left side and on the right side the graters values
     */
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        // Set swap index to store at the beginning the pivot index
        int swapIndex = pivotIndex;
        // For loop to iterate from the pivot index + 1 until the end index
        for (int iteration = pivotIndex + 1; iteration <= endIndex; iteration++) {
            // Check if the item at the iteration index is less than the pivot
            if (array[iteration] < array[pivotIndex]) {
                // Increase one the swap index
                swapIndex++;
                // Swap the item at the swap index with the item at iteration index
                // This is to put the greater values on the right side
                swap(array, swapIndex, iteration);
            }
        }
        // Swap the item at the pivot index with the item at the swap index
        swap(array, pivotIndex, swapIndex);
        // Return where the pivot item was moved
        return swapIndex;
    }

    /**
     * Recursive method to sort an array
     * @param array The entire array
     * @param left The index where is going to be the pivot to compare which each other items
     * @param right The index where the for is going to stop
     */
    private static void quickSortHelper(int[] array, int left, int right) {
        // Base case: If this condition is true, it means that array has one item
        // And it sorted the left and right side
        if (left < right) {
            // Get the index where the pivot (as parameter) was inserted
            // on the right index (sorted)
            // This is used to break on left and right side
            int pivotIndex = pivot(array, left, right);
            // Recursive to order the left side from left until pivot index minus one
            quickSortHelper(array, left, pivotIndex - 1);
            // Recursive to order the right side from pivot index plus one until the right side
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    /**
     * The quick sort method to call the helper method that will sort the array
     * @param array The array you want to sort
     */
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 7, 3, 2, 5};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}
