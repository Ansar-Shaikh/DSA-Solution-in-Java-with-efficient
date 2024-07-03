import java.util.*;
class bintodec 
{
	public static void bintodec(int binu){
		int mynum=binu;
		int pow=0;
		int  dec=0;
		while(binu>0){
			int lastdigit=binu%10;
			dec=dec+(lastdigit*(int)Math.pow(2,pow));
			pow++;
			binu/=10;
		}
		System.out.println("decimal number is "+mynum+"="+dec);
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter your numbeer binary");
		int binary=sc.nextInt();
              bintodec(binary);
	}
}
