package datastructures.heap;

public class Main {
    public static void main(String[] args) {
        // testInsert();
        testRemove();
    }

    public static void testRemove() {
        Heap myHeap = new Heap();
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);

        System.out.println("*** Print the heap ***");
        System.out.println(myHeap.getHeap());

        System.out.println("\n*** Remove the top item ***");
        System.out.println(myHeap.remove());
        System.out.println("*** Print the heap ***");
        System.out.println(myHeap.getHeap());

        System.out.println("\n*** Remove the top item ***");
        System.out.println(myHeap.remove());
        System.out.println("*** Print the heap ***");
        System.out.println(myHeap.getHeap());
    }

    public static void testInsert() {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());

        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        /*
            EXPECTED OUTPUT
            --------------
            [99,72,61,58]
            [100,99,61,58,72]
            [100,99,75,58,72,61]

         */
    }
}
