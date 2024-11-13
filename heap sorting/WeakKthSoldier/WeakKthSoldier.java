import java.util.*;
class WeakKthSoldier

{
	static class Row implements Comparable<Row>
	{
		int idx;
		int soilder;
		public Row(int soilder , int idx){
			this.idx=idx;
			this.soilder=soilder;
		}
		@Override
			public int compareTo(Row r2){
				// soilder same huaa to idx ke basis pe sorting hogi
				if (this.soilder==r2.soilder)
				{
					return this.idx-r2.idx;
				}
				else{
					 return this.soilder-r2.soilder;
				}
			}
	}
	public static void main(String[] args) 
	{
		int army[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
		int k=2;
		PriorityQueue<Row> pq=new PriorityQueue<>();
		for (int i=0;i<army.length ;i++ )
		{
			int count=0;
			for (int j=0;j<army[0].length ;j++ )
			{
				count+=army[i][j]==1 ? 1 : 0 ;
			}
			pq.add(new Row(count,i));
		}
		// kth element
		for (int i=0;i<k ;i++ )
		{
			System.out.println("R"+pq.remove().idx);
		}
	}
}
