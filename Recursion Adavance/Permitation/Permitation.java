class Permitation  
{

	public static void Permitation(String str,String permutation){
		int count =0;
		if (str.length()==0)
		{
			System.out.println(permutation);
			
          count++;
		}
		for (int i=0;i<str.length() ;i++ )
		{
			//char of each
			char ch =str.charAt(i);
			String newstr=str.substring(0,i)+str.substring(i+1);
			Permitation(newstr,permutation+ch);
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		String str="pratu";
		Permitation(str,"");
		
	}
}
