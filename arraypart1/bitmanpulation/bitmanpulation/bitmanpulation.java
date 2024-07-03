class bitmanpulation 
{
	public static void oddoreven(int n){
		int bitmask=1;
		if ((n & bitmask)==0)
		{
System.out.println("!number is ven");
		}
		else{
			System.out.println("number is odd");
		}
	}
	public static void main(String[] args) 
	{
		oddoreven(3);
		oddoreven(6);
		
	}
}
