import java.util.*;
class calculator   
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter your  two number!");
				int a =sc.nextInt();
								int b =sc.nextInt();
										System.out.println("enter your  opertor!");
										char operator =sc.next().charAt(0);
										switch(operator){
											case '+':
											{
                                              System.out.println("addition is "+ (a+b));	
											  break;
											}
		                       		case '-' :
											{
                                              System.out.println("subtrationis "+ (a-b));	
											  break;
											}
											case '/':
											{
                                              System.out.println("division is "+ (a/b));	
											  break;
											}
											case '*' :
											{
                                              System.out.println("multiplication is "+ (a*b));	
											  break;
											}
											default :
												System.out.println("invalid data");
	}
}
}