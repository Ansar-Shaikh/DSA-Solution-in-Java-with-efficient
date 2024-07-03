class FindSubSetOfString 
{
	public static void FindSubset(String str,String ans,int i){
		//base case

		if (i== str.length())
		{
			System.out.println(ans+" ");
			return ;
		}
		//yes choices
		FindSubset(str,ans+str.charAt(i), i+1);

		// no choices
		FindSubset(str,ans,i+1);

	}
	public static void main(String[] args) 
	{
		String str="pratu";
        FindSubset(str," ",0);
	}
}
