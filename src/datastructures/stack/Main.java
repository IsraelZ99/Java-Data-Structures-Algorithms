package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        testPush();
    }

    public static void testPush() {
        Stack myStack = new Stack(2);

        myStack.push(1);

        System.out.println("*** Print stack ***");
        myStack.printStack();
    }

    public static void testConstructor() {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        System.out.println("*** Print stack ***");
        myStack.printStack();
    }
}
