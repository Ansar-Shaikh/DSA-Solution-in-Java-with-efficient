import java.util.*;
class BipartileGraph

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
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));

	}
	public static boolean Bipartile(ArrayList<Edge> graph[]){
		int col[]=new int[graph.length];
	// intialyy with -1
	for (int i=0;i<col.length ;i++ )
	{
		col[i]=-1;
	}
	// decalring queue
	Queue<Integer> q=new LinkedList<>();
	for (int j=0;j<graph.length ;j++ )  // disconnect graph ke liye 

	{
		  if (col[j]==-1)
		  {
			  q.add(j);
			  col[j]=0;// yellow color
			  while (!q.isEmpty())
			  {
				  int curr=q.remove();// bfs start from here
				  for (int k=0;k<graph[curr].size() ;k++ )
				  {
                        Edge e=graph[curr].get(k);
						if (col[e.dest]==-1)
						{
							int nextcol=col[curr]==0 ? 1 : 0; // update color next to it 
							col[e.dest]=nextcol;
							q.add(e.dest);
						}
						else if (col[e.dest]==col[curr])
						{
							return false;
						}
				  }
			  }
		  }
	}
	return true;
	}
	public static void main(String[] args) 
	{
		int v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		creategraph(graph);

		System.out.println(Bipartile(graph));
	}
}
