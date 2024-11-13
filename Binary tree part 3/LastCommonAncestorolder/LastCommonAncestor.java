import java.util.*;
class LastCommonAncestor 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node (int data){
			this.data=data;
             this.left=left;
			 this.right=right;
		}
	}
	// to calculated path of  any n taak
	public static boolean getpath(Node root ,int n, ArrayList<Node> path){
		if (root==null)
		{
			return false;
		}
		path.add(root);
		// n ele mila 
		if (root.data==n)
		{
			return true;
		}
		// nhi mila to left subtree or righttree subtree  dekho 
		boolean lefttree=getpath(root.left,n,path);
		boolean righttree=getpath(root.right,n,path);
		if (lefttree|| righttree)
		{
			return true;
		}
		path.remove(path.size()-1);// last ka ele to remove kro
		return false;
	}
	public static Node lca(Node root , int n1, int n2){
		ArrayList<Node>path1=new ArrayList<>();
		ArrayList<Node>path2=new ArrayList<>();
		// calling  to finding n node taak 
		getpath(root,n1,path1);// calculated krke degaa funtion 
		getpath(root,n2,path2);
           int i=0;
		   for (;i<path1.size() && i<path2.size() ;i++ )
		   {
			   if (path1.get(i) != path2.get(i))
			   {
				   break;
			   }
		   }
		   // ith -1 ka index obivously lca hogach
		   Node lca=path1.get(i-1);
		   return lca;
	}
	public static void main(String[] args) 
	{
		        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
		System.out.println("Lowest common ancestor :!"+lca(root,4,5).data);
	}
}
