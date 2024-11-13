import java.util.*;
class FindIterinaryEelement

{
	public static  String getstart(HashMap<String, String> tickets){
		HashMap<String, String> revmap=new HashMap<>();
		// reverse an map 
		// from becomes to 
		// to becomes from
		for ( String key:tickets.keySet() )
		{
			revmap.put(tickets.get(key), key);
		}
           ///to find start point 
		   for (String key:tickets.keySet())
		   {
			   if (!revmap.containsKey(key))
			   {
				   return key;// starting point
			   }
		   }
		   return null;
	}
	public static void main(String[] args) 
	{
		HashMap<String, String> tickets= new HashMap<>();
		tickets.put("Chennai","benguru");
		tickets.put("mumbai","delhi");
		tickets.put("goa","chennai");
		tickets.put("delhi","goa");
		String start=getstart(tickets);
		System.out.print(start);
		for (String key:tickets.keySet() )
		{
          System.out.print("=>"+tickets.get(start));
		  start=tickets.get(start);
		}
	}
}
