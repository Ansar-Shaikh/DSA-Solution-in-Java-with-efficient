import java.util.*;
class IteratorHashSet 

{
	public static void main(String[] args) 
	{
		HashSet<String> cities=new HashSet<>();
		cities.add("mumbai");
		cities.add("new delhi");
		cities.add("nevare");
		for (String city: cities )
		{
			System.out.print(city+" ");
		}
		Iterator it=cities.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Hello World!");
	}
}
