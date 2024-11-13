import java.util.*;
class ReverseString 
{
	public static String ReverseString(String str){
		Stack<Character> s=new Stack<>();
		int idx=0;
		while (idx<str.length())
		{
			s.push(str.charAt(idx));
			idx++;
		}
		StringBuilder newstr=new StringBuilder("");
		while (!s.isEmpty())
		{
			char curr=s.pop();
			newstr.append(curr);
		}
		return newstr.toString();
	}
	public static void main(String[] args) 
	{
		ReverseString  s=new ReverseString ();
String str="pratu";
		System.out.println("reversing string is of pratu is :"+ReverseString(str));
	}
}
