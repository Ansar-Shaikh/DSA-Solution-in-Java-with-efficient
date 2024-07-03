import java.util.*;
class PairSumArray 
{
	public static  boolean PairSum(ArrayList<Integer> list, int target){
		int lp=0;

		int Rp=list.size()-1;
		while (lp !=Rp)
		{
			// case 11
			if (list.get(lp)+list.get(Rp)==target)
			{
				return true;
			}
			else if (list.get(lp)+list.get(Rp)<target)
			{
				lp++;
			}
			else {
				Rp--;
			}
		}
		return false;
		}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int target=5;
		System.out.println(PairSum(list,target));
	}
}
