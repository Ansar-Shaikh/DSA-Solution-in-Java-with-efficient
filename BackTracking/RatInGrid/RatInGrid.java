class RatInGrid
{
	public static void Gridpath(int i,int j, int n, int m,String str, int maze[][]){
		// base case
		if (i>n || j>m)
		{ return ;
		}
		if (i==n-1 && j==m-1)
		{
			System.out.println(str);
			return;
		}
		// recursion 
		// rigth
		Gridpath(i,j+1,n,m,str+"R",maze);
		// downward
				Gridpath(i+1,j,n,m,str+"D",maze);
	}
	public static void main(String[] args) 
	{
		int n=5;
		int m=5;
		int maze[][]={{1,0,1,0,0},{1,1,1,0,0},{1,0,0,1,0},{1,0,0,0,0},{1,0,0,1,0}};
	Gridpath(0,0,n,m, "",maze);
	}
}
