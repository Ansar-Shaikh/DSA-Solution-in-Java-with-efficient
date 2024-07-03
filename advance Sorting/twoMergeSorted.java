class twoMergeSorted 
{
	public static int [] twoMergeSorted(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int result[]=new int [n+m];
		int i=0;// for Array  1 pointer
		 int j=0;   // for aray 2 pointer
			 int k=0; // for result array 
         while (i<n && j<m)
         {
			 if (arr1[i]<arr2[j])
			 {
				 result[k]=arr1[i];
				 i++;
			 }
			 else {
				result[k]=arr2[j];
				j++;

			 }
			 k++;
         }
		 while (i<n)
		 {
			 result[k]=arr1[i];
			 k++;
			 i++;
		 }
		 	 while (j<m)
		 {
			 result[k]=arr1[j];
			 k++;
			 i++;
		 }
		 return result;

	}
	public static void main(String[] args) 
	{
		int arr1[]={1,3,4,5,7,9};
		int arr2[]={2,4,6,8};
		int res[]=twoMergeSorted(arr1,arr2);
		for (int i=0;i<res.length ;i++ )
		{
					System.out.print(res[i]+" ");
		}

	}
}
