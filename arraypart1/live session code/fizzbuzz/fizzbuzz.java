import java.util.*;
class fizzbuzz 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
					System.out.println("enter your number!");
					int num=sc.nextInt();
		if(num% 3==0 && num % 5==0){
		System.out.println("FIZZBUZZZ!");
		}
		else if (num% 5==0)
		{
					System.out.println("BUZZ!");
		}
		else if (num% 3==0)
		{
								System.out.println("FIZZ!");
		}
		else {
								System.out.println("no"+num);
	}
	}
}
