import java.util.*;
class array 
{
	public static void arrayupdate(int mark[]){
		for (int i=0;i<mark.length ;i++ )
				{
					mark[i] +=2;
				}
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Hello enter array size   !");
		int size=sc.nextInt();
		int mark[]=new int[size];
	        	//accepting input arrayy 
				System.out.println("Hello enter array element   !");
				for (int i=0;i<mark.length ;i++ )
				{
					mark[i]=sc.nextInt();

				}
				arrayupdate(mark);
				for (int i=0;i<mark.length ;i++ )
				{
				 System.out.println("array element:"+mark[i]);

				}

	}
}

