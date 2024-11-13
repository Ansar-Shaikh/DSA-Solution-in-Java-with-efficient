import java.util.*;

class nearbyCar 
{
	static class point implements Comparable<point>
	{
		int x; 
		int y;
		int i;
		int distsq;
		public point(int x, int y, int distsq,int i){
			this.x=x;
			this.y=y;
			this.distsq=distsq;
			this.i=i;
		}
		@Override
			public  int  compareTo(point p2){
				return this.distsq-p2.distsq;
			}
	}
	public static void main(String[] args) 
	{
		int pts[][]={{3,3},{5,-1},{-2,4}};
		int k=2;
		PriorityQueue<point> pq=new PriorityQueue<>();
		for (int i=0;i<pts.length ;i++ )
		{ 
			 int dist=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
			pq.add(new point( pts[i][0],pts[i][1],dist,i));
		}// k th nearset element 


		for (int i=0;i<k ;i++ )
		{
			System.out.println("C"+pq.remove().i);
		}
		System.out.println("Hello World!");
	}
}
