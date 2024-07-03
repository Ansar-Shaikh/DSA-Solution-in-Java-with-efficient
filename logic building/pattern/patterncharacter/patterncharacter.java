import java.util.*;

class patterncharacter
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
				System.out.println("enter your number of line!");
		        int n=sc.nextInt();
				char ch='A';
				for(int i=1; i<=n; i++){
					for (int number =1;number<=i ;number++ )
					{
								System.out.print(ch);
								ch++;
					}
		System.out.println();

	}
}
}
