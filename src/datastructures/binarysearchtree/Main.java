package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        // testConstructor();
        testInsert();
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
