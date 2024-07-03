import java.util.*;
class RecursionOfSum 
{

	public static int CalSum(int n){
        if (n==1)
        {
			return 1;
        }
		int sm1=CalSum(n-1);
		int sum=n+sm1;
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number :");
		int n=sc.nextInt();
		int result=CalSum(n);
		System.out.println("sum of number is !  " +n + " is " +result);
	}
}
