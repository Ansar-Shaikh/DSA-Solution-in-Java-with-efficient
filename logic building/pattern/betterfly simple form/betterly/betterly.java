class betterly 
{
	public static void betterfly(int n){

	int curr_number_line=1;
 int 	total_number=2*(n-1);
	int star=1;
	int spaces=2*(n-1);
	while (curr_number_line<total_number)
	{
		//star
		for (int i=1;i<star ;i++ )
		{
			System.out.print(i);
		}
		//space
		for (int i=1;i<spaces ;i++ )
		{
			System.out.print(" ");
		}
		//star
		for (int i=1;i<star ;i++ )
		{
			System.out.print(i);
		}
		//preapare for next line 

		System.out.println();
		if (curr_number_line<n)
		{
			star++;
			spaces-=2;
		}
		else{
			star--;
			spaces+=2;
			}
			curr_number_line++;
	}
	}
	public static void main(String[] args) 
	{
		betterfly(7);
		System.out.println("Hello World!");
	}
}