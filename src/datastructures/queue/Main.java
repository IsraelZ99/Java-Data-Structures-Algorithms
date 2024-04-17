package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        testEnqueue();
    }

    public static void testEnqueue() {
        Queue myQueue = new Queue(1);

        System.out.println("*** Enqueue an item ***");
        myQueue.enqueue(2);

        System.out.println("\n*** Print the Queue ***");
        myQueue.printQueue();
    }

    public static void testConstructor() {
        Queue myQueue = new Queue(7);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
