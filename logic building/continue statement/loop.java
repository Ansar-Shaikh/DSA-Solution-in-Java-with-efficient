import java.util.*;
class loop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		do{
			int n =sc.nextInt();
			if(n% 10 ==0){
				continue;
			}
		}
		while(true);

		System.out.println("number is "+n);
	}
}
