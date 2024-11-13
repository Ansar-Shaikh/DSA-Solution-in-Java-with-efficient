import java.util.*;
class  BFSInGraph
{

	static class Edge
	{
		int src, wt, dest;
		Edge(int src, int dest, int wt){
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
	public static void BFS(ArrayList<Edge> graph[]){
		//decalring queue;
		// declaring Visited Array boolean type
		Queue<Integer> q=new LinkedList<>();
		boolean visited[]=new boolean [graph.length];
		// src starting any node 
		q.add(0);// zero is starting index;
		while (!q.isEmpty())
		{
			int curr=q.remove();
			if (! visited[curr])
			{
				// mtlb visit kro 
				System.out.print(curr+" ");
				visited[curr]=true;
				// neighbour node traverse
				for (int i=0;i<graph[curr].size() ;i++ )
				{
					Edge e=graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int v=7;
		// vertex
		ArrayList<Edge> graph[]=new ArrayList[v];
		creategraph(graph);
		BFS(graph);

		
	}
}
