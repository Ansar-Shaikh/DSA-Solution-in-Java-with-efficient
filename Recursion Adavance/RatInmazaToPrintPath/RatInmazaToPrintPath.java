class RatInmazaToPrintPath 

{
	/// we have to implement in four direction
	public static void  RatInmaza(int i, int j, int n,int m,int maza[][] ,String str){
		//base case
		if ( i<0|| j<0||i==n||j==m|| maza[i][j]==0)
		{
			return;

		}
		if (i==n-1 && j==m-1)
		{
			System.out.print(str);
			return ;
		}
		maza[i][j]=0; // taki cycle na form huyeee;
		 RatInmaza(i-1,j,n,m,maza,str+'U');
		 RatInmaza(i,j+1,n,m,maza,str+'R');
		 RatInmaza(i,j-1,n,m,maza,str+'L');
		 RatInmaza(i+1,j,n,m,maza,str+'D');
		 maza[i][j]=1; // backtracking 
	}
	public static void main(String[] args) 
	{
		int  n=3;
		int m=3;
		
int maza [][]={{1,0,0},{1,1,0},{1,1,1}};
 RatInmaza(0,0,n,m,maza," ");
	
	}
}