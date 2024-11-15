import java.util.*;
class HasPathExists


{
	static class Edge
	{
		int src, wt, dest;
		Edge(int src, int dest,int wt){
			this.wt=wt;
			this.dest=dest;
			this.src=src;
		}
	}
		public static void creategraph(ArrayList<Edge> graph[]){
		// each node traverse kro ArrayList create kro 
		for (int i=0;i<graph.length ;i++ )
		{
			graph[i]=new ArrayList<>();


		}
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));
		graph[1].add(new Edge(1,0,1));
		graph[1].add(new Edge(1,3,1));
		graph[2].add(new Edge(2,0,1));
		graph[2].add(new Edge(2,4,1));
		graph[3].add(new Edge(3,1,1));
		graph[3].add(new Edge(3,4,1));
		graph[3].add(new Edge(3,5,1));
		graph[4].add(new Edge(4,2,1));
		graph[4].add(new Edge(4,3,1));
		graph[4].add(new Edge(4,5,1));
		graph[5].add(new Edge(5,3,1));
		graph[5].add(new Edge(5,4,1));
		graph[5].add(new Edge(5,6,1));
		graph[5].add(new Edge(6,5,1));
	}
	public static void DFS(ArrayList<Edge> graph[], int curr , boolean vis[]){
		// visite it first 
		System.out.print(curr+" ");
		vis[curr]=true;
		// curr ka neightbour kko find kro 
		for (int i=0;i<graph[curr].size() ;i++ )
		{
			Edge e= graph[curr].get(i);
			if (!vis[e.dest])
			{
				DFS(graph, e.dest, vis);
			}
		}
	}
	public static boolean HasPath(ArrayList<Edge> graph[], int src ,int dest, boolean vis[]){
		if (src==dest)
		{
			return true;
		}
		vis[src]=true;
		// to find neighbour
		for (int i=0;i<graph[src].size() ;i++ )
		{
			// drawen edge
			Edge e=graph[src].get(i);
			if (! vis[e.dest] && HasPath(graph,e.dest,dest,vis))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{

		int v=7;
		// vertex
		ArrayList<Edge> graph[]=new ArrayList[v];
		creategraph(graph);
		int src=0;
		int dest=9;
		// o to 9 is exist or not check
	System.out.println(HasPath(graph,src,dest,new boolean[v]));

	}
}
