import java.util.*;
class overloading  
{
	public  static int multiply (int a, int b){
		return a*b;
	}
public  static float multiply (float a, float b){
		return a*b;
	}
	public static void main(String[] args) 
	{ 
		Scanner sc =new Scanner (System.in);
		System.out.println("enter your 4 number first two number is int type and 3.4 id float type:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		float numf1=sc.nextFloat();
				float numf2=sc.nextFloat();
				int result=multiply(num1,num2);
				float result1=multiply(numf1,numf2);
				System.out.println("int data type is :"+result);
								System.out.println("int float type is :"+result1);
	}
}