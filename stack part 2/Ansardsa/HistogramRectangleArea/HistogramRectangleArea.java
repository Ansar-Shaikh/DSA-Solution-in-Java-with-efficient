import java.util.*;
class HistogramRectangleArea 
{

	public static int largestArea( int height[]){
		int maxarea=0;
		for (int i=0;i<height.length ;i++ )
		{
			int h=height[i];
			int left=i;
			int right=i;
			while (left>=0 && height[left]>=height[i])
			{
				left--;
			}
			while (right<height.length && height[right]>=height[i]){
				right++;
			}
			int area=(right-left-1)*height[i];
			maxarea=Math.max(maxarea,area);
		}
		return maxarea;
	}
	public static void main(String[] args) 
	{
		int height[]={2,1,5,6,2,3};
System.out.println(largestArea(height));

}
	
}
