import java.util.*;
class LargestSizeOfBST 
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
	static class info
	{
		int size;
		boolean isBST;
		int  max;
		 int min;
		 info(boolean isBST, int size, int min, int max){
			this.isBST=isBST;
			this.size=size;
			this.min=min;
			this.max=max;
		 }
	}
	public static int maxBST=0;
	public static info largestsize(Node root){
		
  if (root == null)
  {
	  return new info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
  }

	 // each ki info chachiye 
		// left ki info nikalo /
		info leftinfo=largestsize(root.left);
	// right ki info nikalo
      	info rightinfo=largestsize(root.right);
       int size=leftinfo.size+rightinfo.size+1;
       int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
	   int max=Math.max(root.data, Math.max(leftinfo.max,rightinfo.max));
	   if (root.data<=leftinfo.max | root.data>=rightinfo.min){
		   return new info(false,0,min, max);
	   }
	   // both leftsubtree and rightsubtree are valid then 
	   if (leftinfo.isBST && rightinfo.isBST){
		   maxBST=Math.max(maxBST,size);
		return new info(true, size, min ,max);

	}
            return new info(false, 0, min , max);
	}
	public static void main(String[] args) 
	{
		Node root=new Node(50);
		root.left=new Node(30);
		root.left.left=new Node(5);
		root.left.right=new Node(20);
	   root.right=new Node (60);
	   root.right.left=new Node(45);
	   root.right.right=new Node(70);
	   root.right.right.left=new Node(65);
	   root.right.right.right=new Node(80);
	   info info=largestsize(root);
		System.out.println("largestsize!"+maxBST);
	}
}
