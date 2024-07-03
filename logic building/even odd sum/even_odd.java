import java.util.*;
class even_odd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number;
	int choice;
	int evensum=0;
	int oddsum=0;

		do{
		System.out.println("enter your number");
		 number=sc.nextInt();
		if(number % 2 == 0){
			evensum+=number;
		
		}
		else{
			oddsum+=number;
				
		}
				System.out.println("do you want to be enter number yes/ no ");
				choice=sc.nextInt();
	}
	while(choice==1);
	System.out.println("number is even"+evensum);
		System.out.println("number is odd"+oddsum);

	}
}
