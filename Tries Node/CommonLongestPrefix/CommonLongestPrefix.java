class CommonLongestPrefix 
{
	public static String longestCommon(String word[]){
		if (word== null || word.length==0)
		{
			return " ";
		}
		// assuming first  letter is prefix
		String prefix=word[0];
		for (int i=0;i<word.length ;i++ )
		{
			while (word[i].indexOf(prefix) !=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
			}
		
		}
		return prefix;
	}
	public static void main(String[] args) 
	{
		String word[]={"flower","flow","flight"};
		System.out.println(longestCommon(word));
	}
}
