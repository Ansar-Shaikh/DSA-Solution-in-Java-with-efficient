import java.util.*;

class kausarajuAlgoStronglyConnectGraph {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kausarajuAlgo(ArrayList<Edge> graph[], int v) {
        // Step 1: Topological Sorting
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // Step 2: Transpose the Graph
        ArrayList<Edge> transpose[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < v; i++) {
            for (Edge e : graph[i]) {
                transpose[e.dest].add(new Edge(e.dest, e.src)); // Reverse edge
            }
        }

        // Step 3: Perform DFS on Transposed Graph
        System.out.println("Strongly Connected Components:");
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.print("SCC: ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        kausarajuAlgo(graph, v);
    }
}
