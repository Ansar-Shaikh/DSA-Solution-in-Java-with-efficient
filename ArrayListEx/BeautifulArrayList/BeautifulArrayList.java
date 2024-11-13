import java.util.*;

class BeautifulArrayList 
{

	public static ArrayList<Integer> beautiful(int n){
		ArrayList<Integer> ans=new ArrayList<>();
		ans.add(1);
		for (int i=2;i<=n ;i++ )
		{
			ArrayList<Integer>temp =new ArrayList<>();
			for (Integer ele:ans )
			{
				if (2*ele<=n)
				{
					temp.add(2*ele);
				}
			}
			for (Integer ele:ans )
			{
				if (2*ele-1<=n)
				{
					temp.add(2*ele-1);
				}
			}
			ans=temp;

		}
		return ans;
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer>res=beautiful(10);
		for (int i=0;i<res.size() ;i++ )
		{
			System.out.print(res.get(i)+ " ");
		}
	}
}
