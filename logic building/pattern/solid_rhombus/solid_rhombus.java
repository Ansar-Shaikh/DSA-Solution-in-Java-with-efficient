import java.util.*;
class solid_rhombus 
{
	public static void solidrhombus(int n){
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=(n-i) ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=n ;j++ )
			{
	 		System.out.print(" *");

			}
							System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
	System.out.println("enter your number to which print the rhombus:");
	int rhombus=sc.nextInt();
		System.out.println("Hello solid _rhombus by ANU BHAI!");
		solidrhombus(rhombus);
	}
}
