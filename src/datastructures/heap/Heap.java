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
