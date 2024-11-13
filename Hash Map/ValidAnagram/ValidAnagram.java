import java.util.*;
class  ValidAnagram

{
	public static boolean validangram(String s, String t){
		// both length are different then it is not angram 
		if (s.length() != t.length())
		{
			return false;
		}
		HashMap<Character, Integer> map=new HashMap<>();
		// character and freq ko store krta intialy
		for (int i=0;i<s.length() ; i++)
		{
			char ch=s.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for (int i=0;i<t.length() ;i++ )
		{
			char ch=t.charAt(i);
			if (map.get(ch) != null)
			{
				if (map.get(ch)==1)
				{
                    map.remove(ch);
				}
				else{
					// decrease freq by one
					map.put(ch,map.get(ch)-1);
				}
			}
			else{
				return false;
			}
		}
		return map.isEmpty();
	}
	public static void main(String[] args) 
	{
		String s="race";
		String t="care";
		System.out.print("valid angram"+validangram(s,t));
		
	}
}
