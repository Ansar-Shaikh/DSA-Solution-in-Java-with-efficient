import java.util.*;
class DuplicateParenthessInStringUsingStack 
{
	public static boolean DuplicateString(String str){
		Stack<Character> s=new Stack<>();
		for (int i=0;i<str.length() ;i++ )
		{

		     char ch=str.charAt(i);
			 // closing bracket
			 if (ch==')')
			 {
				 int count=0;
				 while (s.peek() !='(')
				 {
					 s.pop();
					 count++;
				 }
				 if (count<1)
				 {
					 return true;// duplicte find directly found bracket
				 }
				 else{
					 s.pop();
				 }
			 }
			 else{
				 s.push(ch);
			 }
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String str="(a+b)";
		System.out.println(DuplicateString(str));
	}
}
