package algorithms.sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Bubble sort algorithm, to sort an array
     * The way to do, is compare couples of indexes
     * checking if the first one is greater than the second one
     * if it's true, the greatest value is going to pass to the right side
     * and the less value is pass to the left side
     * All of this, to sort the greatest value first, at the end of the array
     * @param array
     */
    public static void bubbleSort(int[] array) {
        // For loop, in each iteration going to lock one by one of the last index
        for (int i = array.length - 1; i > 0; i--) {
            // For loop, to iterate through the entire list until the index => i
            for (int j = 0; j < i; j++) {
                // If the value at the index j is greater than the value at the index j +1
                if (array[j] > array[j + 1]) {
                    // Set temp, to store the greater value
                    int temp = array[j];
                    // Set the value at index j, to store the less value
                    array[j] = array[j + 1];
                    // Set the value at the index j + 1, to store the grater value
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
