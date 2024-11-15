import java.util.*;
class  CycleInDirectedGraph 
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
	public static void creategraph(ArrayList<Edge> graph[]){
		for (int i=0;i<graph.length ;i++ )
		{
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,0));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,0));
	}
	public static boolean isCycle(ArrayList<Edge> graph[]){
		boolean vis[]=new boolean[graph.length];
		boolean stack[]=new boolean[graph.length];
		for (int i=0;i<graph.length ;i++ )
		{
			if (!vis[i])
			{
				if (isCycleUtility(graph,i,vis,stack))
				{
					// first time cycle found huaa to

					return true;

				}
			}
		}
		return false;
	}
	public static boolean isCycleUtility(ArrayList<Edge>graph[],int curr , boolean vis[], boolean stack[]){
		vis[curr]=true;
		stack[curr]=true;
		for (int i=0;i<graph[curr].size() ;i++ )
		{
			Edge e=graph[curr].get(i);
			if (stack[e.dest])
			{
				return true;
				// curr stack mai present hai 
			}
			if (!vis[e.dest] && isCycleUtility(graph,e.dest,vis,stack))
			{
				return true;
			}
		}
		stack[curr]=false;
		return false;
	}
	public static void main(String[] args) 
	{
		ArrayList<Edge> graph[]=new ArrayList[4];
		creategraph(graph);
		System.out.println(isCycle(graph));
	}
}
