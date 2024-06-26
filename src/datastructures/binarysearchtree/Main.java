package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        // testInsert();
        // testContains();
        // testRemove();
        // testRecursiveContains();
        // testRecursiveInsert();
        testRecursiveDelete();
    }

    public static void testRecursiveDelete() {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        /*
                  2
                 / \
                1   3
         */
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root>Right: " + myBST.root.right.value);

        System.out.println("\n*** Deleting 2 node ***");
        myBST.rDeleteNode(2);
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root>Right: " + myBST.root.right);


    }

    public static void testRecursiveInsert() {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("*** Inserting the 2 node ***");
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

    }

    public static void testRecursiveContains() {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Is the tree contains the number 27?: " + myBST.rContains(27));
        System.out.println("Is the tree contains the number 17?: " + myBST.rContains(17));
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
