import java.util.*;
class StackBottomEle 
{

	public static void PushBottom(Stack<Integer>s,int data){
		if (s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top=s.pop();
		PushBottom(s,data);// next itration ke liye
		s.push(top);// deleted ele to be added
	}
	public static void main(String[] args) 
	{
		Stack<Integer>s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		PushBottom(s,4);
		while (!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
}
