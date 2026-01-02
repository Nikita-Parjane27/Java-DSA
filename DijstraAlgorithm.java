import java.util.*;

public class DijstraAlgorithm {
    // Implementation of Dijkstra's algorithm for shortest paths using priority queue
    public int[] dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];

            if (visited[node]) continue;
            visited[node] = true;

            for (int i = 0; i < n; i++) {
                if (graph[node][i] > 0) { // there is an edge
                    int newDist = dist[node] + graph[node][i];
                    if (newDist < dist[i]) {
                        dist[i] = newDist;
                        pq.add(new int[]{i, newDist});
                    }
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0}
        };

        DijstraAlgorithm dijkstra = new DijstraAlgorithm();
        int startVertex = 0;
        int[] distanceArray = dijkstra.dijkstra(graph, startVertex);

        System.out.println("Distance array from vertex " + startVertex + ":");
        for (int i = 0; i < distanceArray.length; i++) {
            System.out.println("Vertex " + i + ": " + distanceArray[i]);
        }
    }
}
