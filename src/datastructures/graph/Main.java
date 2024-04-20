package datastructures.graph;

public class Main {
    public static void main(String[] args) {
//        testAddVertex();
        testAddEdge();
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
