import java.util.*;
class Detectcyle 
{
	static class Edge
	{
		int src;
		int dest;
		Edge(int src, int dest){
			this.dest=dest;
			this.src=src;
		}
	}
	public static void creategraph(ArrayList<Edge>graph[]){
		for (int i=0;i<graph.length ;i++ )
		{
			graph[i]=new ArrayList<>();
		}
	graph[0].add(new Edge(0,1));
	graph[0].add(new Edge(0,2));
	graph[0].add(new Edge(0,3));
	graph[0].add(new Edge(1,0));
	graph[0].add(new Edge(1,2));
	graph[0].add(new Edge(2,0));
	graph[0].add(new Edge(2,1));
	graph[0].add(new Edge(3,0));
	graph[0].add(new Edge(3,4));
	graph[0].add(new Edge(4,3));
	}
	public static boolean detectcycle(ArrayList<Edge>graph[]){
		boolean vis[]=new boolean[graph.length];
		for (int i=0;i<graph.length ;i++ )
		{
			if (!vis[i])
			{
			if (detectcycleutility(graph, vis, i, -1))
			{
				// exit cycle one time 
				return true;
			}

		}
		}
		return false;
	}
	
	public static boolean detectcycleutility(ArrayList<Edge>graph[],boolean vis[],int curr, int par){
	             
			vis[curr]=true;
			for (int i=0;i<graph[curr].size()	;i++ )
			{
				Edge e=graph[curr].get(i);
				if (!vis[e.dest] && detectcycleutility(graph,vis,e.dest,curr))
				{
					//case 3
					return true;
				}
				else if (vis[e.dest] && par != e.dest)
				{
					return true;// case;2visited but not parent
				}
				// nothing case 1 continue 
			}
			return false;
	}
	public static void main(String[] args) 
	{
		int  v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		creategraph(graph);
		System.out.println(detectcycle(graph));
	}
}