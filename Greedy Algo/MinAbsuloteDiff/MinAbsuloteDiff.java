import java.util.*;
class  MinAbsuloteDiff
{
	public static void main(String[] args) 
	{
		int A[]={1,2,3};
		int B[]={3,2,1};
		Arrays.sort(A);
		Arrays.sort(B);
		int mindiff=0;
		for (int i=0;i<A.length ;i++ )
		{
			mindiff+=Math.abs(A[i]-B[i]);
		}
		System.out.println("Min diff of pairs!"+mindiff);
	}
}
