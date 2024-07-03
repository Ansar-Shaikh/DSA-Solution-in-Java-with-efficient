class GridPathBacktracking 
{
	public static void gridprint
		(int i,int j,int n, int m ,String str){
		//base case
		if (i>n || j>m)
		{
			return ;
		}
		if (i==n && j==m)
		{
			System.out.println(str);
			return;
		}
		 // go to right
		 gridprint(i+1,j,n,m,str+"R");
		 // go to down 
		 gridprint(i,j+1,n,m , str+"D");
	}
	public static void main(String[] args) 
	{
		int n=3;
		int m=3;
		gridprint(1,1,n,m, "");
		
	}
}
