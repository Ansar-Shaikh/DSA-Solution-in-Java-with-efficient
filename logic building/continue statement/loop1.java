import java.util.*;
class loop1 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner (System.in);
		do{
			 n =sc.nextInt();
			if(n% 10 ==0){
				continue;
			}
			System.out.println("number is "+n);
		}
		while(true);

		
	}
}