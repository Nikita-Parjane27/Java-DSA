import java.util.ArrayList;

public class Graph {
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void print() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" -> " + adjList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void createEdge(int u, int v) {
        adjList.get(u).add(v);  
        adjList.get(v).add(u);  
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.createEdge(0, 1);
        graph.createEdge(0, 4);
        graph.createEdge(1, 2);
        graph.createEdge(1, 3);
        graph.createEdge(1, 4);

        graph.print();
    }
}
