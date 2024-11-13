import java.util.*;

class CheapestFlightKStop {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info {
        int v;
        int cost;
        int stop;

        Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stop = s;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int flight[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    public static int cheapestFlight(int n, int k, int flight[][], int src, int dest) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flight);

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (curr.stop > k) {
                continue;
            }

            for (Edge e : graph[curr.v]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    q.add(new Info(v, dist[v], curr.stop + 1));
                }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        int n = 4;
        int src = 0, dest = 3, k = 1;
        int flight[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int result = cheapestFlight(n, k, flight, src, dest);
        System.out.println(result);
    }
}
