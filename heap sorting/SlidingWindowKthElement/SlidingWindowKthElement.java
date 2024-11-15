import java.util.*;
class SlidingWindowKthElement
{
	static class pair implements Comparable<pair>
	{
		int val;
		int idx;

		public pair(int val, int idx){
			this.idx=idx;
			this.val=val;

		}
		@ Override
			public int compareTo(pair p2){
				// asc
				//return this.val-p2.val;
				// dec
				return p2.val-this.val;
			}
	}
	public static void main(String[] args) 
	{
		int arr[]={1,3,-1,-3,5,3,6,7};
		int k=3;// window size
		// declare an array
		int res[]=new int[arr.length-k+1];
		PriorityQueue<pair> pq=new PriorityQueue<>();
		// first add element in k elem window
		for (int i=0;i<k ;i++ )
		{
			pq.add(new pair(arr[i],i));
		}
		res[0]=pq.peek().val;// value add kiya first max ele ki 
		// to other eleement in array
		for (int i =k;i<arr.length ;i++ )
		{
			while (pq.size()>0 && pq.peek().idx<=(i-k))
			{
				pq.remove();// PQ ke top ka idx ki val less chahiye current idx se
			}
			pq.add(new pair(arr[i],i));
			res[i-k+1]=pq.peek().val;
		}
		//print ke liye 
		for (int i=0;i<res.length ;i++ )
		{
			System.out.print(res[i]+" ");
		}

		System.out.println("Hello World!");
	}
}