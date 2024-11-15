import java.util.*;
class  FractionalKnapsack
{
	public static void main(String[] args) 
	{
		int weight[]={10,20,30};
		int val[]={60,100,120};
		int W=50;// bag weight
		//declare 2 d array
		double ratio[][]=new double [val.length][2];// first column store index and second will be store ratio
	
		for (int i=0;i<val.length ;i++ )
		{
			ratio[i][0]=i;// index store at first col
			ratio[i][1]=val[i]/(double)weight[i];// ratio store at col 2
		}
			// ascending 
		Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));// only sorting apply to ration wala col
		// descending chahiye sortiiing kiya but apneko desecnding pahijhe
		int capacity=W;
		int finalvalue=0;
		for (int i=ratio.length-1;i>=0 ;i-- )
		{
            int idx=(int)ratio[i][0];
			if (capacity>=weight[idx])
			{
				//all including 
				finalvalue+=val[idx];
				capacity-=weight[idx];
			}
			else{
				// not all including 
				finalvalue+=(ratio[i][1]*capacity);
				capacity=0;
				break;
			}
		}
		System.out.println(finalvalue);
	}
}
