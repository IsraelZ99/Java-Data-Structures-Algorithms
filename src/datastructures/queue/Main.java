package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        testConstructor();
    }

    public static void testConstructor() {
        Queue myQueue = new Queue(7);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
