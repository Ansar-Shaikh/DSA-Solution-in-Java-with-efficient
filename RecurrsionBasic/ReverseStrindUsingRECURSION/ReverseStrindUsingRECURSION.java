class ReverseStrindUsingRECURSION 
{
	public static void printRevStr(String str,int idx){
		if (idx==0)
		{
			System.out.print(str.charAt(idx));
			return ;
		}
					System.out.print(str.charAt(idx));
					printRevStr(str,idx-1);

	}
	public static void main(String[] args) 
	{
		String str="Pratu";
			System.out.println("BEST FRD IN REVERSE ORDER!");
		printRevStr(str,str.length()-1);
	
	}
}
