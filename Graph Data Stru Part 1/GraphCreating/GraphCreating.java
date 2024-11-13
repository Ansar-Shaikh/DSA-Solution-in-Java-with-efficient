import java.util.*;
class GraphCreating  
{

	static class Edge
	{
		int src;
		int wt;
		int dest;
		Edge(int src, int wt, int dest){
			this.src=src;
			this.wt=wt;
			this.dest=dest;

		}
	}
	public static void main(String[] args) 
	{
		int v=5;
		// vertex
		ArrayList<Edge> graph[]=new ArrayList[v];
		for (int i=0;i<v ;i++ )
		{
			graph[i]=new ArrayList<>();
		}
		// 0 vertex
		graph[0].add(new Edge(0,1,1));
		//  1 vertex
		graph[1].add(new Edge(1,0,5));
		graph[1].add(new Edge(1,3,3));
		graph[1].add(new Edge(1,2,1));
		// 2 vertex
		graph[2].add(new Edge(2,1,1));
		graph[2].add(new Edge(2,3,1));
		graph[2].add(new Edge(2,4,2));
		// 3 vertex 
		graph[3].add(new Edge(3,2,1));
		graph[3].add(new Edge(3,1,3));
		// 4 vertex
		graph[4].add(new Edge(4,2,2));
		// second vertex neighbours
		for (int i=0;i<graph[2].size() ;i++)

		{
			Edge e=graph[2].get(i);
			System.out.println(e.dest);
		}
		
		System.out.println("Hello World!");
	}
}
