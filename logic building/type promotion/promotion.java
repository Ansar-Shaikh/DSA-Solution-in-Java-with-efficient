//type promotion

import java.util.*;
class promotion
{
	public static void main (String[] args ){
		Scanner sc=new Scanner(System.in);
		byte b;
		long a;
		float c;
		double d;
		System.out.println("enter your number 4");
		b=sc.nextByte();
				a=sc.nextLong();
						c=sc.nextFloat();
								d=sc.nextDouble();
//type casting									
	int result=( int)(b*a*c*d);
		System.out.println(result);
	}
}