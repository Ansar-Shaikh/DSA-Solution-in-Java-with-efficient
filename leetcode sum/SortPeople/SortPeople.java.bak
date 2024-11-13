import java.util.*;
class SortPeople 
{
	public static String[] sortpeople(int height, String name[]){
		Map<Integer,String> map=new int Hashmap<>();
		Arrays.sort(height);
		for (int i=0;i<name.length ; i++)
		{
			map.put(height[i],name[i]);
		}
		int idx=0;
		String resultname[]=new String[name.length];
		for (int i=name.length-1;i>=0 ;i-- )
		{
			resultname[idx]=map.get(height[i]);
			idx++;
		}
		return resultname;
	}
	public static void main(String[] args) 
	{
		int he[]={100,80,601};
		int name[]={"ram","pratu","asuu"};
		String res[]=sortpeople(he,name);
	   for (int i: res )
	   {
	    	System.out.println(i);
	   }
	}
}
