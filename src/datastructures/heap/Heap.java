package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * The class to create and use heap
 * This heap uses the spot of index 0
 * And is going to have one index as spot at the end of the list
 */
public class Heap {
    private ArrayList<Integer> heap;

    /**
     * Constructor to create the array list to implement
     * the heap
     */
    public Heap() {
        heap = new ArrayList<>();
    }

    /**
     * Creates new list to return a copy of the heap
     *
     * @return new array list that contains a copy of the heap
     */
    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    /**
     * Insert new value on to the heap
     *
     * @param value it's the number/value of the node
     */
    public void insert(int value) {
        // First, add the value at the on the array list
        heap.add(value);
        // Set current, to store the last index of the array list
        // In this index where the value was inserted
        int current = heap.size() - 1;
        // While loop, until current will be greater than zero and
        // the value that is in current is greater than the parent value of current
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            // Swap the current with his parent (this means that current is greater than his parent)
            swap(current, parent(current));
            // Set current, to now store the index where the current value was moved (in the last step)
            current = parent(current);
        }
    }

    /**
     * Remove the top item of heap
     * Remember: You can only remove the top item
     * When you remove the top item , the last value of the heap is replaced instead of
     * @return The value that has the removed node
     */
    public Integer remove() {
        // Check if the array list is empty
        if (heap.size() == 0) return null;
        // Check if the size of the array list is 1, to only remove the node
        if (heap.size() == 1) return heap.remove(0);

        // Set max value to store the value has the top of the heap
        int maxValue = heap.get(0);
        // Set the value of the index 0 of the array list, to store the last value
        // of the list
        heap.set(0, heap.remove(heap.size() - 1));
        // Sink down the new value on the index 0 (to have a validate heap)
        sinkDown(0);
        // Return the value was deleted on the heap
        return maxValue;
    }

    /**
     * Sink down specific value on to the heap, to have valid it
     * @param index The index you want to sink down on to the heap
     */
    public void sinkDown(int index) {
        // Set max index to store the index
        int maxIndex = index;
        // While loop, until has a return
        while (true) {
            // Set left index, to store the left child index of the max index
            int leftIndex = leftChild(maxIndex);
            // Set right index, to store the right child index of the max index
            int rightIndex = rightChild(maxIndex);

            // Check that:
            // - The left index is not outside the range of the last index in the arraylist
            // - The left child value is greater than the value at max index
            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            // Check that:
            // - The right index is not outside the range of the last index in the arraylist
            // - The right child value is greater than the value at max index
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }

            // Check if max index is not equals index
            if (maxIndex != index) {
                // Swap the index and max index
                swap(index, maxIndex);
                // Set index to store max index, now
                index = maxIndex;
            } else {
                return;
            }

        }
    }

    /**
     * Get the left child from specific parent
     *
     * @param index The index of the parent
     * @return The index where the left child is
     */
    private int leftChild(int index) {
        // The math multiply 2 by the parent index
        // plus one
        // This plus one is because we use the index of zero
        // of the array list
        return 2 * index + 1;
    }

    /**
     * Get the right child from specific parent
     *
     * @param index The index of the parent
     * @return The index where the right child is
     */
    private int rightChild(int index) {
        // The math multiply 2 by the parent index
        // plus two
        // This plus one is because we use the index of zero
        // of the array list
        return 2 * index + 2;
    }

    /**
     * Get the parent from specific child on to the heap (array list)
     *
     * @param index The index of the child
     * @return The index where the parent is
     */
    private int parent(int index) {
        // The math is index minus one
        // divide by two
        // This minus one is because we use the index of zero
        // of the array list
        return (index - 1) / 2;
    }
    /**
     * Swap two values
     * @param index1 The index where is the value you want to change to the index 2
     * @param index2 The index where is the value you want to change the index 1
     */
    private void swap(int index1, int index2) {
        // Set temp to get the value of the index 1
        int temp = heap.get(index1);
        // Set the index 1 to put the value of the index 2
        heap.set(index1, heap.get(index2));
        // Set the index 2 to put the value of the index 1
        heap.set(index2, temp);
    }
}
