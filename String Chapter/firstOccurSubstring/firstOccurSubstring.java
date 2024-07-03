class firstOccurSubstring 
{
	public static int firstOccu(String str,String sub){
		if (sub.isEmpty())
		{

			return 0;
		}
		return str.indexOf(sub);
	}
	public static void main(String[] args) 
	{
		String str="hello";
		String sub="ll";
		System.out.println("first Occur Substring :::!"+firstOccu(str,sub));
	}
}
