import java.util.*;
class KeyPaidLetterCombination 
{

	static String keypad[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void keypad(String str, String ans){
		if (str.length()==0)
		{
			System.out.println(ans);
			return;
		}
        String key= keypad[str.charAt(0)-48];
		for (int i=0;i<key.length();i++ )
		{
			keypad(str.substring(1),ans+key.charAt(i));
		}


	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number:");
		String str=sc.next();
	keypad(str," ");
	}
}