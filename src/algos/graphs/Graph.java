package algos.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    private final int countOfVertices; // Number of vertices/nodes
    private final Map<Integer, List<Integer>> adjList; // Adjacency list representation

    public Graph(int vertices) {
        this.countOfVertices = vertices;
        adjList = new HashMap<>();
        // Initialize adjacency lists for all vertices
        for (int i = 1; i <= vertices; i++) {
            adjList.put(i, new LinkedList<>());
        }
    }

    // Function to add an edge between two vertices
    public void addEdge(int u, int v) {
        // Add v to u's list and u to v's list
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // Function to print the adjacency list representation of the graph
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int vertex : entry.getValue()) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);

        // Add edges
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(1, 4);
        graph.addEdge(3, 5);

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }


}
