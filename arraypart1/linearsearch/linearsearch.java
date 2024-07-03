import java.util.*;
class linearsearch  
{
	public static int linearsearch(int number[],int key){
		for (int i=0;i<number.length ;i++ )
		{
			if (number[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Hello enter ur desired key element :!");
		int key=sc.nextInt();
			System.out.println("Hello enter ur  array size:");
			int size=sc.nextInt();
		int number[]= new int [size];
				System.out.println("Hello enter ur array element :!");
		 for (int i=0;i<number.length ;i++ )
		 {
			 number[i]=sc.nextInt();
		 }
		int index=linearsearch(number,key);
		if (index==-1)
		{
           	System.out.println("not found ");
		}
		else {
				System.out.println("array at index is :"+index);

		}

	}
}
