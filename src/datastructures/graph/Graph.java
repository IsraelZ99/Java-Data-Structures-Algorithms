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
}
