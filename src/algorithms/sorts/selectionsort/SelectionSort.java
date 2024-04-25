package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Selection sort algorithm, to sort an array
     * The way to do, is in each iteration search
     * the lowest value, and store the index, thus
     * swap the current index with the minimum value index
     * @param array The array you want sort
     */
    public static void selectionSort(int[] array) {
        // For loop, to iterate through the entire list
        for (int i = 0; i < array.length; i++) {
            // Set min index to store the current index
            int minIndex = i;
            // For loop, to iterate from the i + 1 until the last one
            // item of the array, to find the minimum value
            for (int j = i + 1; j < array.length; j++) {
                // Check if the value of the index j is less than the
                // value of the minimum index
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Check if the minimum value change
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        selectionSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
