import java.util.ArrayList;
class  ArraayList
{


	public static void main(String[] args) 
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("ansar");
		list.add("pratu");
		list.add(0,"suru");
		System.out.println(list);
		list.remove("suru");
				System.out.println(list);
				list.set(1,"ashu");
						System.out.println(list);
						list.contains("pratu");
								System.out.println(list);
	}
}
