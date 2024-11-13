import java.util.*;
class AllPathPrintSrcToDest

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
		graph[0].add(new Edge(0,3));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,1));
		graph[4].add(new Edge(4,0));
		graph[4].add(new Edge(4,1));
		graph[5].add(new Edge(5,0));
		graph[5].add(new Edge(5,2));
	}
	public static void AllPathPrintSrcToDest(ArrayList<Edge> graph[],int src, int dest,String  path){
		if (src==dest)
		{
			System.out.print(path+dest+" ");// self node ki last mai value print kro
			return ;
		}
		// for neightbour ke liye 
		for (int i=0;i<graph[src].size() ;i++ )
		{
			Edge e=graph[src].get(i);
               AllPathPrintSrcToDest(graph,e.dest,dest,path+src);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		ArrayList<Edge> graph[]=new ArrayList[6];
		creategraph(graph);
		AllPathPrintSrcToDest(graph,5,1 ," ");
		
	}
}
