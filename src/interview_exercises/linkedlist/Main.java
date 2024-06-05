package interview_exercises.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(0);
        list.append(1);

        list.printList();
        System.out.println("\nHead: " + list.getHead().value);
        System.out.println("Tail: " + list.getTail().value);

        System.out.println("************* BINARY TO DECIMAL *************");
        System.out.println(list.binaryToDecimal());

        /*
        System.out.println("************* REMOVE DUPLICATES *************");
        list.removeDuplicates();
        list.printList();
        */

        /*
        System.out.println("************* PARTITION LIST *************");
        list.partitionList(5);
        list.printList();
        System.out.println("\nHead: " + list.getHead().value);
        System.out.println("Tail: " + list.getTail().value);
         */

        /*
        System.out.println("************* CHECK IF THE LINKED LIST HAS LOOP *************");
        System.out.println("Has loop? " + list.hasLoop());
        */

        /*
        System.out.println("************* FIND THE KTH NODE FROM THE END OF THE LINKED LIST *************");
        System.out.println("Kth node " + list.findKthFromEnd(6).value);
        */

        /*
        System.out.println("************* FIND THE MIDDLE NODE OF THE LINKED LIST *************");
        System.out.println("\nMiddle Node: " + list.findMiddleNode().value);
        */

        /*
        System.out.println("************* REVERSE THE LIKED LIST *************");
        list.reverse();

        list.printList();
        System.out.println("\nHead: " + list.getHead().value);
        System.out.println("Tail: " + list.getTail().value);
        */
    }
}
