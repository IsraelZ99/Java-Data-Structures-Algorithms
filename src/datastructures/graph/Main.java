package datastructures.graph;

public class Main {
    public static void main(String[] args) {
        testAddVertex();
    }

    public static void testAddVertex() {
        Graph myGraph = new Graph();
        System.out.println("Adding new vertex: " + myGraph.addVertex("A"));

        myGraph.printGraph();
    }
}
