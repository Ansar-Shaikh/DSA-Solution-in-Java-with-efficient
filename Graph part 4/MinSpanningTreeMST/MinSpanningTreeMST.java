import java.util.*;
class  MinSpanningTreeMST
{
	static class Edge

	{
		int src;
		int wt;
		int dest;
		public Edge(int src, int dest, int wt){
			this.src=src;
			this.dest=dest;
			this.wt=wt;

		}
	}
	static class Pair implements Comparable<Pair> 
	{
		int v;
		int cost;
		Pair(int v, int wt){
			this.v=v;
			this.cost=wt;
		}
		@Override
			public int compareTo(Pair p2){
			return this.cost- p2.cost;
		}
	}
	public static void creategraph(ArrayList<Edge> graph[]){
		for (int i=0;i<graph.length ;i++ )
		{
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0,1,0));
		graph[0].add(new Edge(0,2,5));
		graph[0].add(new Edge(0,3,30));
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,3,40));
		graph[2].add(new Edge(2,0,15));
		graph[2].add(new Edge(2,3,50));
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
	}
	public static void primsMST(ArrayList<Edge> graph[]){
		// declare boolean visited array
		boolean vis[]=new boolean[graph.length];
		// declare priority queue
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		// intialization pq src=0, cost =0;
		pq.add(new Pair(0,0));
		int Finalcost=0;
		while (!pq.isEmpty())
		{
			Pair curr=pq.remove();
			// curr is not visited so to be vist it
			if (!vis[curr.v])
			{
				vis[curr.v]=true;
				Finalcost+=curr.cost;
				// for that neighbour 
				for (int i=0 ;i<graph[curr.v].size();i++ )
				{
					Edge e=graph[curr.v].get(i);
					// neighbour edge add int pq
					pq.add(new Pair(e.dest,e.wt));
				}
			}
		}
		System.out.println("final costof min spanning tree is"+Finalcost);
	}
	public static void main(String[] args) 
	{
		int V=4;
		ArrayList<Edge>graph[]=new ArrayList[V];
		creategraph(graph);
		primsMST(graph);
	}
}
