class LargestOddKthElement 
{
	public static int LargestOddElemenet(int L, int R, int  k){
		// 1) total number of eleemnet 

		int totalnumber=R-L+1;
		int totalnumofodd=0;
		//2) total number of odd element
		if (R %2!=0 && L%2!=0)
		{
              totalnumofodd=(totalnumber/2)+1; // both are odd
		}
		else{
			totalnumofodd=totalnumber/2;  // any one odd and any one even
		}
		if (k>totalnumber)
		{
			return 0;
		}
		int largest_value=0;
		//3) largest element
            if (R%2!=0)
            {
				largest_value=R;
            }
			else {
				largest_value=R-1;
			}

		// 4)kth element
                 return largest_value-(2*(k-1));
	}
	public static void main(String[] args) 
	{
		System.out.println(LargestOddElemenet(-3,3,1));
	}
}
