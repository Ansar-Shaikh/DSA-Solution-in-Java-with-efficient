class  StartWithPrefix

{
	static class Node
	{
		Node children[]=new Node[26];
		boolean eow;
		Node(){
			for (int i=0;i<26 ;i++ )
			{

				children[i]=null;
			}
		}
	}
	public static Node root=new Node();// root node is always empty
	public static void insert(String words){
		Node  curr=root;
		// levelwise traverse to tries
		for (int level=0;level<words.length() ;level++ )
		{
			int idx=words.charAt(level)-'a';
			if (curr.children[idx]==null)
			{
				curr.children[idx]=new Node();
				// create new node in it 
			}
		   // update pointer of  it curr
		   curr=curr.children[idx];
		}
		curr.eow=true;
	}
	public static boolean search(String key){
		Node curr=root;
		// levelwise traveser it 
		for (int level=0;level<key.length();level++ )
		{
			int idx=key.charAt(level)-'a';
			if (curr.children[idx]==null)
			{
				return false;
			}
		curr	=curr.children[idx];// update curr pointer
		}
		return curr.eow==true;// whole string traverse hui to return true otherwise false

	}
	public static boolean StartWithPrefix(String prefix){
		Node curr=root;
		for (int i=0;i<prefix.length() ;i++ )
		{
			int idx=prefix.charAt(i)-'a';
			if (curr.children[idx]== null)
			{
				return false;
			}
			curr=curr.children[idx];
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String word[]={"zebra","dog","dove","dock"};
		for (int i=0;i<word.length ;i++ )
		{
			insert(word[i]);
		}
           System.out.println(StartWithPrefix("doc"));
		   System.out.println(StartWithPrefix("dockk"));
	}
}
