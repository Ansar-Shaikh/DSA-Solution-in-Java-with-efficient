class  binarySearchtree

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
	public static boolean searchbst(Node root , int key){
		if (root==null)
		{
			return false ;
		}
		if (root.data==key)
		{
			return true;
		}
		if (root.data>key)
		{
			return searchbst(root.left,key);
		}
		else{
			return searchbst(root.right,key);
		}
	}

	public static void main(String[] args) 
	{
		    Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
   int key =2;
   if (searchbst(root,2))
   {
	   System.out.println("key is :"+key+"Found");
   }
   else{
		System.out.println("key is :!"+key +"Not Found");
	}
}

}
