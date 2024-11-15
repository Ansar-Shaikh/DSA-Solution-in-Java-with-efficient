
import java.util.*;
class TopologicalSortingUsingBFS
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
			graph[5].add(new Edge(5,2));
	}
	public static void calulateindgree(ArrayList<Edge>graph[],int indeg[]){
		for (int i=0;i<graph.length ;i++ )
		{
			int vertex=i;
			for (int j=0;j<graph[vertex].size() ;j++ )
			{
				Edge e=graph[vertex].get(j);
				indeg[e.dest]++;
			}
		}
	}
	public static void toposort(ArrayList<Edge>graph[]){
		int indeg[]=new int[graph.length];
		calulateindgree(graph,indeg);
		// decalring queue
		Queue<Integer>queue=new LinkedList<>();
		// intially koi node kaisa ho jis ki degree zero ko usko queue mai add kro
		for (int i=0;i<indeg.length ;i++ )
		{
			if (indeg[i]==0)
			{
				queue.add(i);
			}
		}
		while (!queue.isEmpty())
		{
			int curr=queue.remove();
			System.out.print(curr+" ");
			for (int i=0;i<graph[curr].size() ;i++ )
			{
				Edge e=graph[curr].get(i);
				indeg[e.dest]--;// uske neighbour node ko reduce by one 
				if (indeg[e.dest]==0)
				{
					queue.add(e.dest);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Edge> graph[]=new ArrayList[6];
		creategraph(graph);
		toposort(graph);
		System.out.println("Hello World!");
	}
}
