package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        // testEnqueue();
        testDequeue();
    }

    public static void testDequeue() {
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);

        System.out.println("\n*** Print the Queue before ***");
        myQueue.printQueue();

        System.out.println("\n*** Dequeue items ***");
        System.out.println("Dequeue: " + myQueue.dequeue().value);
        System.out.println("Dequeue: " + myQueue.dequeue().value);
        System.out.println("Dequeue: " + myQueue.dequeue());

        System.out.println("\n*** Print the Queue after ***");
        myQueue.printQueue();
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
