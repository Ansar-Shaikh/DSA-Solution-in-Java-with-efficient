import java.util.*;
class  ActivitySelection
{
	public static void main(String[] args) 
	{
		int start[]={1,3,0,5,8,5};
		int end[]={2,4,6,7,9,9};
		// according end basis pe sort hai
		int maxAct=0;
		// decalare an array
		ArrayList<Integer> ans=new ArrayList<>();
	  // first Activity
	  maxAct++;
	  int lastend=end[0];
	  for (int i=1;i<end.length ;i++ )
	  {
		  // without overlapping start wala to end se or disjoint hona
		  if (start[i]>= lastend)
		  {
			  maxAct++;
			  ans.add(i);
			  lastend=end[i];// upadating lastend wala
		  }
	  }

		System.out.println("Maxmun Activity !"+maxAct);
		for (int i=0;i<ans.size() ;i++ )
		{
			System.out.print(" A"+ans.get(i)+" ");
		}
		System.out.println();
	}
}
