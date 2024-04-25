package algorithms.sorts.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Insertion sort algorithm, to sort an array
     * The way to do, is compare one index value
     * with the before indexes, until one of these
     * is going to be less than the current index
     * While the before indexes value are less than
     * the current index, this si going to be swap
     * @param array The array you want sort
     */
    public static void insertionSort(int[] array) {
        // For loop, start from the first index of the array,
        // until the last one item
        for (int i = 1; i < array.length; i++) {
            // Set temp, to store the value of the current index
            int temp = array[i];
            // Set j, to store the index before the current index
            int j = i - 1;
            // While loop: While j is greater than -1
            // And the value of the current index is less than
            // the value on index of j
            while (j > -1 && temp < array[j]) {
                // Set the greater value to the right side
                array[j + 1] = array[j];
                // Set the less value to the left side
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        insertionSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }

}
