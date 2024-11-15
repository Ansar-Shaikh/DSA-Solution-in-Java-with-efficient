class bitmanpulationsetbit 
{
	public static int setithbit(int n,int i){

		int bitmask=1<<i;
		return n | bitmask;
	}
		public static int getithbit(int n,int i){

		int bitmask=1<<i;
		if ((n & bitmask)==0)
		{
			return 0;
		}
	    return 1;
	}

public static String oddoreven(int n){
	int bitmask=1<<0;
	if ((n & bitmask)==0)
	{
		return "even";
	}
	return "odd";
}
public static int clearithbit(int n,int i){
	int bitmask =~(1<<i);
	return n & bitmask;
}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
				System.out.println("bitmask of n number: "+setithbit(10,2));
				System.out.println("bitmask of n number: "+getithbit(10,2));
				System.out.println("bitmask of n number: "+oddoreven(10));
				System.out.println("bitmask of n number: "+clearithbit(10,1));
	}
}
