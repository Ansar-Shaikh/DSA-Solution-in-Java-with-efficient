
import java.util.*;
class PrefixWord

{
	static class Node
	{
		Node children[]=new Node[26];
		boolean eow=false;
		int freq;
		Node (){
			for (int i=0;i<26 ;i++ )
			{
				children[i]=null;
			}
			freq=1;
		}
	}
	public static Node root=new Node();// intially empty root node
	public static void insert(String word){
		Node curr=root;
		for (int level=0;level<word.length() ;level++ )
		{
			int idx=word.charAt(level)-'a';// convert into integer
			if (curr.children[idx]== null)
			{
				// if curr node is null we create new node
				curr.children[idx]=new Node();

			}
			else{
				// if curr node is allready is exist
				//update frequency
				curr.children[idx].freq++;
			}
			// update pointer curr node 
			curr=curr.children[idx];
		}
	}
	public static void FindPrefix(Node root, String ans){
		if (root==null)
		{
			return ;
		}
		if (root.freq==1)
		{
			System.out.println(ans);
			return;
		}
		for (int i=0;i<root.children.length ;i++ )
		{
			if (root.children[i]!= null)
			{
				// valid index
				FindPrefix(root.children[i],ans+(char)(i+'a'));    // next string ke liye  call krnaaa 

			}

		}
	}
	public static void main(String[] args) 
	{
		String word[]={"zebra","dog","dove","dock"};
		for (int i=0;i<word.length ;i++ )
		{
			insert(word[i]);
		}
		root.freq=-1;// root ki freq is always  is one 
	FindPrefix( root ," ");
	}
}
