import java.util.*;
class TopologicalSorting 
{

	static class Edge
	{
		int src;
		int dest;
		Edge(int src, int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	public static void creategraph(ArrayList<Edge>graph[]){
		for (int i=0;i<graph.length ;i++ )
		{
			graph[i]=new ArrayList<>();
		}
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,1));
		graph[4].add(new Edge(4,0));
		graph[4].add(new Edge(4,1));
		graph[5].add(new Edge(5,0));
	}
	public static void topsort(ArrayList<Edge>graph[]){
	Stack<Integer>stack=new Stack<>();
		boolean vis[]=new boolean[graph.length];
		for (int i=0;i<graph.length ;i++)
		{
			if (!vis[i])
			{
				topsortutiliity(graph,i,vis,stack);
			}
		}
		while (!stack.isEmpty())
		{
			System.out.print(stack.pop()+"  ");
		}
	}
	public static void topsortutiliity(ArrayList<Edge> graph[],int curr, boolean vis[],Stack<Integer>stack){
		vis[curr]=true;
		for (int i=0;i<graph[curr].size() ;i++ )
		{
			// edge find kro first 
			Edge e=graph[curr].get(i);
			if (!vis[e.dest])
			{
				topsortutiliity(graph,e.dest,vis,stack);
			}
		}
		stack.push(curr);
	}
	public static void main(String[] args) 
	{
		int v=6;
		ArrayList<Edge> graph[]=new ArrayList[v];
		creategraph(graph);
		topsort(graph);
		System.out.println("topological sort !");
	}
}
