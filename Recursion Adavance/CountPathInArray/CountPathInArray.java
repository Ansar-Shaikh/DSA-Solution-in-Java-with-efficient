class CountPathInArray 
{
	public static int CountPath(int i,int j,int n,int m){
		if (i==n || j==m)       ///////boundry pe element hoga to 
		{
			return 0;
		}
		if (i==n-1 && j==m-1)
		{
			return 1;
		}
		int downpath=CountPath(i+1,j,n,m);  ///***********moves to downword 
		int rightpath=CountPath(i,j+1,n,m);   ///////////**********moves to rightword 
		return downpath+rightpath;
	}
	public static void main(String[] args) 
	{
		int n=3;
		int m=3;

		System.out.println(CountPath(0,0,n,m));
	}
}
