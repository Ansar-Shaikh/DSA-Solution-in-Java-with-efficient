import java.util.*;
class LinkedHashMapOperation 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<String , Integer> map=new LinkedHashMap<>();
		map.put("india",100);
		map.put("usa",500);
		map.put("odisa",800);

		System.out.println("linkedhashmap"+map);
		HashMap<String , Integer> map1=new HashMap<>();
		map1.put("india",100);                                                                           
		map1.put("usa",500);                                                                              	
		map1.put("odisa",800);                                                                          
                                                                                                                       
	
		System.out.println("hashmap"+map1);            
	}
}