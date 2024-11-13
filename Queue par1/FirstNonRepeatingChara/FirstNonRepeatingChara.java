import java.util.*;
class FirstNonRepeatingChara 
{
	public static void FirstNonRepeating(String str){
		int freq[]=new int[26];// 'a' to 'z'
		Queue<Character> q=new LinkedList<>();

		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			q.add(ch);// first queue mai add kro
			freq[ch-'a']++;// freq count increase  if it ispresent 
            while (!q.isEmpty() && freq[q.peek()-'a']>1)
            {
				q.remove();   // 3) remove if its frequency is greater than one
            }
			if (q.isEmpty())
			{
				System.out.print(-1 +" ");
			}
			else{
				System.out.print(q.peek()+" " );
			}
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		String str="aabccxb";
            FirstNonRepeating(str);
		
	}
}
