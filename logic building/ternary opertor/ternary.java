import java.util.*;
class ternary  
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);


		System.out.println("enter your number!");
				int number =sc.nextInt();
				String type=(number%2==0)? "EVEN":"ODD";
				
		System.out.println("type is "+ type);		
	}
}
