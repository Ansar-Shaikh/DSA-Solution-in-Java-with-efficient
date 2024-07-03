class FriendsPairing 
{
	public static int FriendsPairing(int n){
		if (n==1||n==2)
		{
			return n;
		}
		//choices**********
		int fnm1=FriendsPairing(n-1);// single dost ke liye 
		int pairways =(n-1)*FriendsPairing(n-2);
		int totways=fnm1+pairways;
		return totways;
	}
	public static void main(String[] args) 
	{
		System.out.println("pair of friends is: "+FriendsPairing(3));
	}
}
