class ArrayToString 
{
	public static String array[]={"zero","one" ,"two","three","four","five","six","seven","eight","nine"};
	public static void printArray(int num){
		if (num==0)

		{
			return;
		}
		int lastdigit=num%10;
		printArray(num/10);
		System.out.print(array[lastdigit]+" ");
	}
	public static void main(String[] args) 
	{
		printArray(786);
	}
}
