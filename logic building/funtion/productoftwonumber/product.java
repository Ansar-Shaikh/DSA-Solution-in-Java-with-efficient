import java.util.*;
class product 
{
	public static int multiply(int a, int b){
		int product=a*b;
		return product;

	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter yyouur number 2");
		int a=sc.nextInt();
		int b=sc.nextInt();
	int result=	multiply(a,b);
       System.out.println("a*b="+result);
	}
	}

