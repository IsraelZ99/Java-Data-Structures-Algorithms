package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        // testPush();
        testPop();
    }

    public static void testPop() {
        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);

        System.out.println("*** Pop item ***");
        System.out.println(myStack.pop().value);

        System.out.println("\n*** Print stack ***");
        myStack.printStack();
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
