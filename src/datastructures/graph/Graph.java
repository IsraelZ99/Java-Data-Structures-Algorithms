package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    // This adjList will contain vertices and edges (it's the adjacency List)
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    /**
     * Add new vertex to the adjacency list
     *
     * @param vertex The name of the new vertex
     * @return If the vertex was insert or not
     */
    public boolean addVertex(String vertex) {
        // Check if the vertex doesn't exist on the graph
        if (adjList.get(vertex) == null) {
            // Put the new vertex on to the adjacency list
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    /**
     * Add edge between two vertices (bidirectional relationship)
     *
     * @param vertex1 The name of the first vertex will have edge between the other vertex
     * @param vertex2 The name of the second vertex will have edge between the other vertex
     * @return If it was created the edges between the two vertices
     */
    public boolean addEdge(String vertex1, String vertex2) {
        // Check if the two vertices exist on to the adjacency list
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            // Add edge between the vertex 1 with vertex 2
            adjList.get(vertex1).add(vertex2);
            // Add edge between the vertex 2 with vertex 1
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
}
