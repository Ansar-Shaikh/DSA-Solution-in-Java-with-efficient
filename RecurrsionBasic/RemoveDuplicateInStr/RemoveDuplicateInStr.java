class RemoveDuplicateInStr 
{
	public static boolean map[]=new boolean[26];//*********to store the current element is exist or not in array *********
	public static void RemoveDuplicate(String str,int idx,String newstr){
		if (idx==str.length())
		{
			System.out.println(newstr);
			return ;
		}
		char currchar=str.charAt(idx);
		if (map[currchar-'a']==true)
		{
						RemoveDuplicate(str,idx+1,newstr);

		}
		else{
			newstr+=currchar;
			map[currchar-'a']=true;
			RemoveDuplicate(str,idx+1,newstr);
		}
	}
	public static void main(String[] args) 
	{
		String str="aabbnnuugikd";
					RemoveDuplicate(str,0,"");
		System.out.println("Hello World!");
	}
}
