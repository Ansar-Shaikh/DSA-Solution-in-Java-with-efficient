import java.util.*;
class ShortestPath 
{
	public static float ShortestPath(String path){
		int x=0,y=0;
		

		for (int i=0;i<path.length() ;i++ )
		{
			char dir=path.charAt(i);
			if(dir=='S')
			{
				y--;
			}
			else if(dir=='W')
			{
				x--;
			}
			else if(dir=='N')
			{
				y++;
			}
		else
			{
				x++;
			}
		}
		int x2=x*x;
		int y2=y*y;
     return (float) Math.sqrt(x2+y2);
	} 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello enter your string in Capital word to find shortest path !");
		String path=sc.nextLine();
		System.out.println(ShortestPath(path));

	}
}
