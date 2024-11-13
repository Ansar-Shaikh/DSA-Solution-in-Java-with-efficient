class ClimbingCountWays 
{
	public static int countways(int n){
		// base case
		if (n==0)
		{
			return 1;// groung pe itself ho
		}
		if (n<0)
		{
			return 0; // -ve number ground ke niche ja rhaa hai 
		}
		return countways(n-1)+ countways(n-2);
	}
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Climbing count !"+countways(n));
	}
}
