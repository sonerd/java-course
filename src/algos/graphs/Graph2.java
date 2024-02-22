package algos.graphs;

import java.util.Arrays;

public class Graph2 {
    private final int V; // Number of vertices
    private final int[][] adjMatrix; // Adjacency matrix

    public Graph2(int vertices) {
        this.V = vertices;
        adjMatrix = new int[vertices][vertices];

        printGraph();
        System.out.println("after graph initialized");
    }

    // Function to add an edge between two vertices
    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1; // For an unweighted graph, we just set the cell value to 1
        adjMatrix[v][u] = 1; // Undirected graph, so we set both directions
    }

    // Function to print the adjacency matrix representation of the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph2 graph = new Graph2(V);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the adjacency matrix representation of the graph
        graph.printGraph();
    }


}

