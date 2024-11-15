class  KthLevelPrint
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
	public static void klevel(Node root , int level,  int k){
		// base case
		if (root== null)
		{
			return;
		}
		if (level==k)
		{
			System.out.print( root.data+ "  ");
			return ; // agle level pe na jaye given k level print krneke badh;
		}
		klevel(root.left,level+1,k);//  wala level find krega 
		klevel(root.right,level+1,k);//  right wala level find krega 
	}
	public static void main(String[] args) 
	{
			Node root=new Node(1);
	    root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
             int k=3;
		System.out.println("KthLevelPrint");
		klevel(root,1,k);
		
	}
}
