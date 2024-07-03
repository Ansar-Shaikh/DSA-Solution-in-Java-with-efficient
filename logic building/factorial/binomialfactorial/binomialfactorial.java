import java.util.*;
class binomialfactorial
{
	public static int factorial(int n){
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact*=i;
		}
		return fact;
	}
	public static int binocoeff(int n ,int r){  // binomial coeefficient =n!/(r!*n-r!)
		int fact_n=factorial(n);
		int fact_r=factorial(r);
		int fact_nmr=factorial(n-r);
		int binocoeff=(fact_n)/(fact_r*fact_nmr);
		return binocoeff;
	}
	public static void main(String[] args) 
	{ 
		Scanner sc =new Scanner (System.in);
		System.out.println("enter youur number which u want to be find factorial!");
		int nm=sc.nextInt();
		int nm1=sc.nextInt();
		int result = binocoeff(nm,nm1);
	System.out.println("factorial of n number is :"+result);

	}
}

