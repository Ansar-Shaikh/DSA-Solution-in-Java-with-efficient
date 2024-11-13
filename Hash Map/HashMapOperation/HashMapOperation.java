import java.util.*;
class   HashMapOperation
{


	public static void main(String[] args) 
	{
		HashMap<String , Integer> map=new HashMap<>();
		// add key value pair  using put method
		map.put("India",786);
		map.put("China",80);
		map.put("pak",60);
       System.out.println("hash  map print "+map);
	   // get value of any  using key 
	   System.out.println(map.get("India"));
	   System.out.println(map.get("pak"));
	   // contain key or not 
	   System.out.println(map.containsKey("China"));
       // remove
	   System.out.println(map.remove("India"));
		System.out.println(map);
	}
}
