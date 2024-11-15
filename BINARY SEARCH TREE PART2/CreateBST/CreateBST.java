class  CreateBST
{
	static class  Node 
	{
		int data;
		Node left;
		Node right;
		Node(int data){

			this.data=data;
			this.left=null;
			this.right=null;

		}
	}
		public static void preorder(Node root ){
			if (root==null)
			{
				return;
			}
			System.out.print(root.data+"  ");
			preorder(root.left);
			preorder(root.right);

		}
		public static Node createbst(int arr[], int si , int ei){
			if (si> ei)
			{
				return null;
			}
			int mid=(si+ei)/2;
			// create node of it 
			Node root=new Node (arr[mid]);
			root.left=createbst(arr,si,mid-1);
			root.right=createbst(arr,mid+1,ei);
			return root;
		}
	public static void main(String[] args) 
	{
		int arr[]={3,5,6,8,10,11,12};
		Node root=createbst(arr,0,arr.length-1);
		preorder(root);
		System.out.println("Hello World!");
	}
}
