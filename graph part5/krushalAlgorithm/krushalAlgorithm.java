import java.util.*;
class krushalAlgorithm 
{

	static class Edge implements Comparable<Edge>
	{
		int src; 
		int dest;
              int wt;
			  public Edge(int src,int dest,int wt){
				this.src=src;
				this.dest=dest;
				this.wt=wt;
			  }
			  @Override
				  public int compareTo(Edge e2){
					return this.wt-e2.wt;// asc sorting 
				  }
	}
	public static void creategraph(ArrayList<Edge>edges){
		edges.add(new Edge(0,1,10));
		edges.add(new Edge(0,2,15));
		edges.add(new Edge(0,3,30));
		edges.add(new Edge(1,3,40));
		edges.add(new Edge(0,1,10));
		edges.add(new Edge(2,3,50));

	}
	// below code is of union and disjoint algo
	static int n=4;
	static int par[]=new int[n];
	static int rank[]=new int[n];
	public static void init(){
		for (int i=0;i<n ;i++ )
		{
			par[i]=i;// intilization to the parent 
		}
	}
	public static int find(int x){
		if (x==par[x])
		{
			return x;
		}
		return par[x]=find(par[x]);// path compression 
	}
	public static void union(int a, int b){
		int parA=find(a);
		int parB=find(b);
		// rank comparsion 
		if (rank[parA]==rank[parB])
		{
			par[parB]=parA;
			rank[parA]++;
		}
		else if (rank[parA]<rank[parB])
		{
			par[parA]=parB;

		}
		else {
			par[parB]=parA;
		}
	}
	public static void krushakalAlgorithm(ArrayList<Edge> edges,int v){
		init();
	Collections.sort(edges);
	int mstCost=0;
	int count=0;
	for (int i=0;count<v-1 ;i++ )
	{
		// edge draw
		Edge e=edges.get(i);
		// src ,dest,wt
		 int parA=find(e.src);// src=a
		 int parB=find(e.dest);// dest=b
			// cycle not form 
			if (parA != parB)
			{
				union(e.src,e.dest);
				mstCost+=e.wt;
					count++;
			}
	}
            System.out.println("mstCost is  ?"+mstCost);
	}
	public static void main(String[] args) 
	{
		ArrayList<Edge> edges=new ArrayList<>();
		int v=4;
		creategraph(edges);
krushakalAlgorithm(edges,v);
		
	}
}
