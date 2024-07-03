import java.util.*;
class bottomtrianglepattern 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Hello enter your rowws and cols:!");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		for (int i=0;i< rows;i++) 
		{
			for (int j=0;j<=cols;j++)
			{
				System.out.print("* ");    
			} System.out.println();
		}
		
	}
}
