import java.util.*;
class MergeTwoBST  
{
	static class Node 
	{
		int data;
		Node left;
		Node right;
		Node (int data){

			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void getinorder(Node root,ArrayList<Integer>arr){
		if (root==null)
		{
			return ;
		}
		getinorder(root.left,arr);
		arr.add(root.data);
		getinorder(root.right,arr);
	} 
	public static Node createbst( ArrayList<Integer> finallist, int si , int ei){
		if (si>ei)
		{
			return null;
		}
		int mid=(si+ei)/2;
	 Node	 root=new Node(finallist.get(mid));
		root.left=createbst(finallist,si,mid-1);
		root.right=createbst(finallist,mid+1,ei);
		return root;
	}
	public static Node mergebst(Node root1, Node root2){
		//1 inorder of bst1
		ArrayList<Integer>arr1=new ArrayList<>();
		getinorder(root1,arr1);
		//2 inorder of bst2
				ArrayList<Integer>arr2=new ArrayList<>();
		getinorder(root2,arr2);
		// merge two bst in final arraylist
		ArrayList<Integer>finallist=new ArrayList<>();
		int i=0;
		int j=0;
		while (i<arr1.size() && j<arr2.size())
		{
			if (arr1.get(i) <= arr2.get(j))
			{
				finallist.add(arr1.get(i));
				i++;
			}
			else {
				finallist.add(arr2.get(j));
				j++;
			}
			while (i<arr1.size())
			{
              	finallist.add(arr1.get(i));
				i++;
			}
			while (j<arr2.size()		)
			{
				finallist.add(arr2.get(j));
				j++;
			}
		}
		//create bst mid using 
		// finallist mai store huaa ab 
		// create it 
		  return createbst(finallist,0,finallist.size()-1);
		 
	}
	public static void preorder(Node root){
		if (root==null)
		{
			return ;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String[] args) 
	{
		Node root1=new Node(2);
		root1.left=new Node(1);
		root1.right=new Node(4);
		Node root2=new Node(9);
		root2.left=new Node(3);
		root2.right=new Node (12);
		Node root=mergebst(root1,root2);
		preorder(root);
		System.out.println("Hello World!");
	}
}
