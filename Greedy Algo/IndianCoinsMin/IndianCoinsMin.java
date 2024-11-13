import java.util.*;
class  IndianCoinsMin

{
	public static void main(String[] args) 
	{
		Integer  coins[]={1,2,5,10,20,100,50,500,2000};
		Arrays.sort(coins,Comparator.reverseOrder());
		int countofcoins=0;
		int amount=590;
			ArrayList<Integer> ans=new ArrayList<>();
		for (int i=0;i<coins.length ;i++ )
		{
			if (amount>=coins[i])
			{
				while ( amount>=coins[i])
				{
					countofcoins++;
					ans.add(coins[i]);
					amount-=coins[i];
				}
			}
		}
		System.out.println("Min change value of notes!"+countofcoins);
		for (int i=0;i<ans.size() ;i++ )
		{
			System.out.print(ans.get(i)+" ");
		}
	}
}
