import java.util.*;
class MaxLenChain

{
	public static void main(String[] args) 
	{
		int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
		Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));// second number ko sort kiyaa
		int chainlen=1;
		int chainend=pairs[0][1];// second number =col one mai stor hai and col 0/ zero pe start wala number store hai
		for (int i=1 ;i<pairs.length; i++)
		{
			// curr number zeroth  col pe store hai
			if (pairs[i][0]>chainend)
			{
				chainlen++;
				chainend=pairs[i][1];// last wala number 1 col pe store hai 
			}
		}
		System.out.println("Max len of chain!"+chainlen);
	}
}
