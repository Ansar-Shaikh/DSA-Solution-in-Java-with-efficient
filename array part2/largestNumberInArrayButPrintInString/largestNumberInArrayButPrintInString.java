import java.util.*;
class largestNumberInArrayButPrintInString 
{
	public static String largestNumber(int num[]){
		//array to stirng we need to convert
		ArrayList<String> ans=new ArrayList<>();
		for (int i=0;i<num.length ;i++ )
		{
			ans.add(String.valueOf(num[i]));// string mai convert 

		}
		// custome sorting 
		Collections.sort(ans,(s1,s2)->{
			return (s2+s1).compareTo(s1+s2);
		});
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<ans.size() ;i++ )
		{
			sb.append(ans.get(i));
		}
		String res=sb.toString();
		if (res.charAt(0)=='0')
		{
			return "0";
		}
		else
			return res;
		

	}
	public static void main(String[] args) 
	{ int num[]={10,2};

		System.out.println("Hello World!"+largestNumber(num));
	}
}
