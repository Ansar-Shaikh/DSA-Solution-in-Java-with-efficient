import java.util.*;
class factorial 
{
	public static int factorial(int n){
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact*=i;
			
		}
		return fact;
	}
	public static void main(String[] args) 
	{ 
		Scanner sc =new Scanner (System.in);
		System.out.println("enter youur number which u want to be find factorial!");
		int nm=sc.nextInt();
		int result =factorial(nm);
	System.out.println("factorial of n number is :"+result);

	}
}

