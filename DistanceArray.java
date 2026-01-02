import java.util.*;

public class DistanceArray {
/* 
    // Function to create and return distance array using BFS queue
    public static int[] createDistanceArray(int[][] graph, int start) {
        int[] distance = new int[graph.length];
        boolean[] visited = new boolean[graph.length];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        visited[start] = true;
        queue.add(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    distance[i] = distance[node] + 1;
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 0},
            {1, 1, 0, 0, 0}
        };

        int startVertex = 0;
        int[] distanceArray = createDistanceArray(graph, startVertex);

        System.out.println("Distance array from vertex " + startVertex + ":");
        for (int i = 0; i < distanceArray.length; i++) {
            System.out.println("Vertex " + i + ": " + distanceArray[i]);
        }
    } */
  List<ArrayList<Integer>> adj;

public DistanceArray(int n) {
    adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        adj.add(new ArrayList<>());
    }
}

public int[] shortestPathUnitWeights(int src){

    int n = adj.size();      // use existing adj
    int[] dist = new int[n];
    for(int i = 0; i < n; i++) dist[i] = -1;

    int parent[] = new int[n];
    for(int i = 0; i < n; i++) parent[i] = -1;

    Queue<Integer> q = new LinkedList<>();

    dist[src] = 0;
    q.offer(src);

    while(!q.isEmpty()){
        int u = q.poll();
        ArrayList<Integer> list = adj.get(u);

        for(int v : list){
            if(dist[v] == -1){
                dist[v] = dist[u] + 1;
                parent[v] = u;
                q.offer(v);
            }
        }
    }

    return dist;
}

public static void main(String[] args) {

    DistanceArray graph = new DistanceArray(5);

    // You MUST add edges here
    graph.adj.get(0).add(1);
    graph.adj.get(0).add(4);
    graph.adj.get(1).add(0);
    graph.adj.get(1).add(2);
    graph.adj.get(1).add(3);
    graph.adj.get(1).add(4);
    graph.adj.get(2).add(1);
    graph.adj.get(2).add(3);
    graph.adj.get(3).add(1);
    graph.adj.get(3).add(2);
    graph.adj.get(4).add(0);
    graph.adj.get(4).add(1);

    int sourceVertex = 0;
    int[] distances = graph.shortestPathUnitWeights(sourceVertex);
    System.out.println("Shortest path distances from vertex " + sourceVertex + ": " + Arrays.toString(distances));
}

}
