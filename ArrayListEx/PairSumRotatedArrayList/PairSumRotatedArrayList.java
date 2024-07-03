import java.util.*;
class PairSumRotatedArrayList 
{
	public static  boolean PairSum(ArrayList<Integer>list,int target){
		int n=list.size();
		int breakpoint=-1;
		for (int i=0;i<n ;i++ )
		{
			if (list.get(i)>list.get(i+1))

			{
				breakpoint=i;
				break;
			}
		}
		 int lp=breakpoint+1;   // smallest
		int Rp=breakpoint;//llargest
		while (lp !=Rp)
		{
			if (list.get(lp)+list.get(Rp)==target)
			{
				return true;
			}
			// case 2
			if (list.get(lp)+list.get(Rp)<target){
				// updating the left pointer with rotated using module 
				lp=(lp+1) % n;
			}
			else{
				Rp=(Rp+n-1)%n;				// updating the right pointer with rotated using module 
			}

		}
		return false;

	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
	int target=100;
		System.out.println(PairSum(list,target));
	}
}
