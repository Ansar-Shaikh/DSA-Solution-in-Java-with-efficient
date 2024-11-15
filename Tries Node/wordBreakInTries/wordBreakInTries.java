import java.util.*;
class wordBreakInTries
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
	public static boolean wordbreak(String key){
		 if (key.length()==0)
		 {
			 return true;
		 }
		 for (int i=1;i<=key.length() ;i++ )
		 {
			  if (search(key.substring(0,i)) && wordbreak(key.substring(i)))
			  {
				  return true;
			  }
		 }
		 return false;

	}
	public static void main(String[] args) 
	{  
		String words[] = { "the", "there", "any", "a", "their" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
		System.out.println(search("there"));
		String key="was";
		System.out.println(wordbreak(key));


	}
}
