package datastructures.graph;

public class Main {
    public static void main(String[] args) {
//        testAddVertex();
//        testAddEdge();
//        testRemoveEdge();
        testRemoveVertex();
    }

    public static void testRemoveVertex() {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        System.out.println("Deleting vertex: " + myGraph.removeVertex("D"));

        System.out.println("\n *** Print the adjacency list ***");
        myGraph.printGraph();
    }

    public static void testRemoveEdge() {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");

        System.out.println("Removing edge: " + myGraph.removeEdge("A", "B"));

        System.out.println("\n *** Print the adjacency list ***");
        myGraph.printGraph();
    }

    public static void testAddEdge() {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");

        System.out.println("Adding new edge " + myGraph.addEdge("A", "B"));

        System.out.println("\n *** Print the adjacency list ***");
        myGraph.printGraph();

    }

    public static void testAddVertex() {
        Graph myGraph = new Graph();
        System.out.println("Adding new vertex: " + myGraph.addVertex("A"));

        myGraph.printGraph();
    }
}
