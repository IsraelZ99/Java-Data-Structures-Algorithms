package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        // testInsert();
        // testContains();
        testRemove();
    }

    public static void testRemove() {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Removing the node with the number 52: " + myBST.remove(52));
        System.out.println("Check if the node was remove: " + myBST.root.right.left);
    }

    public static void testContains() {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Is the tree contains the number 27?: " + myBST.contains(27));
        System.out.println("Is the tree contains the number 17?: " + myBST.contains(17));
    }

    public static void testInsert() {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Inserting 27 node ...");
        System.out.println(myBST.insert(27));

        System.out.println("\nCheck if the 27 node was insert on the correct side");
        System.out.println("root => left side => right side");
        System.out.println(myBST.root.left.right.value);
    }

    public static void testConstructor() {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root = " + myBST.root);
    }
}
