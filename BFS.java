public class BFS {
    //function for BFS
    public BFS(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        } 
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 0},
            {1, 1, 0, 0, 0}
        };

        System.out.println("BFS traversal starting from vertex 0:");
        new BFS(graph, 0);
    }
}