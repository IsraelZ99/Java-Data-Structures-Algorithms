package interview_exercises.linkedlist;

import java.util.HashSet;
import java.util.Set;

class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("Node: " + temp.value + " -> ");
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Reverse he linked list
     */
    public void reverse() {
        Node temp = tail;
        for (int i = length - 1; i > 0; i--) {
            Node before = get(i - 1);
            temp.next = before;
            temp = before;
        }
        temp.next = null;
        head = tail;
        tail = temp;
    }

    /**
     * Find the middle node in to the Linked List
     * @return The middle node
     */
    public Node findMiddleNode() {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Check if the Linked List has loop.
     * This happens for example, when the linked list doesn't have tail
     * @return If the linked list has loop (the last node doesn't have the
     * next property as null)
     */
    public boolean hasLoop() {
        if (length == 0) return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }

    /**
     * Find the kth node from the end.
     * This means, that will count from the end to the linked list
     * until k index
     * @param k The kth index you want to return
     * @return The node in the kth node
     */
    public Node findKthFromEnd(int k) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            for (int i = 0; i < k; i++) {
                if (fast == null) return null;
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    /**
     * Re-arrange the linked list, to have on to the left side the fewer nodes
     * and on to the right side the bigger nodes given a number.
     * This method doesn't change the order of the nodes, only will re-arrange
     * @param x The number from which where you want to partition the linked list
     */
    public void partitionList(int x) {
        if (head == null) return;
        Node temp = head;
        if (temp.next == null) return;
        Node newNodeGreater = new Node(0);
        Node newNodeLess = new Node(0);
        Node tempGreater = newNodeGreater;
        Node tempLess = newNodeLess;
        while (temp != null) {
            if (temp.value < x) {
                tempLess.next = temp;
                tempLess = temp;
            } else {
                tempGreater.next = temp;
                tempGreater = temp;
            }
            temp = temp.next;
        }
        if (newNodeLess.next != null) head = newNodeLess.next;
        newNodeLess.next = null;
        tempLess.next = newNodeGreater.next;
        tempGreater.next = null;
        tail = tempGreater;
    }

    /**
     * This will remove duplicates in to the linked list, and only
     * left the non-duplicate nodes
     */
    public void removeDuplicates() {
        if (head == null) return;
        Set<Integer> nodesSet = new HashSet<>();
        Node temp = head;
        Node before = head;
        nodesSet.add(temp.value);
        temp = temp.next;

        while (temp != null) {
            if (!nodesSet.contains(temp.value)) {
                System.out.println("It doesn't exist");
                nodesSet.add(temp.value);
                before = before.next;
            } else {
                before.next = temp.next;
            }
            temp = temp.next;
        }
    }

    /**
     * This method will calculate decimal value from the binary
     * values in to every node
     * @return The number on decimal
     */
    public int binaryToDecimal() {
        if (head == null) return 0;
        Node temp = head;
        int num = 0;
        while (temp != null) {
            num = num * 2 + temp.value;
            temp = temp.next;
        }
        return num;
    }

}
