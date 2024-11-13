import java.util.*;
class ValidParenthessesUsingStack 
{
	public static boolean ValidParenthes(String str){
		Stack<Character> s=new Stack<>();
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			// opening bracket 
			if (ch=='('|| ch=='['|| ch=='{')
			{
				s.push(ch);
			}
			//closing
			else{
					if (s.isEmpty())
		{
			return false;
		}
                   // if pair form than then pop it therefore it is valid String 
				   if ((s.peek()=='('&& ch==')')||
					    (s.peek()=='['&& ch==']')||
					 (s.peek()=='{'&& ch=='}'))
				   {
					   s.pop();
				   }
				   else{
					// pair not form then invalid string 
					return false;
				   }
			}
		}
		if (s.isEmpty())
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		String  str="([{}]}})";
		System.out.println(ValidParenthes(str));
	}
}
