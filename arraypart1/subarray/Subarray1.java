import java.util.*;

class Subarray1 {
    public static void subarray(int[] number) {
        int ts = 0;
		int sum=0;
        for (int i = 0; i < number.length; i++) {
			int start=i;
            for (int j = i; j < number.length; j++) {
				int end=j;
                for (int k = start; k <= end; k++) {
					sum+=number[k];
					int result =Math.Max(sum);
                    System.out.print(number[k] + " ");
                }
                ts++;
				     
                System.out.println();
            }
			System.out.println("sumation is :"+result);
        }
		
        System.out.println("Total number of subarrays: " + ts);
    }

    public static void main(String[] args) {
        int[] number = {10, 50, 30, 910, 71, 30};
        subarray(number);
        System.out.println("Hello World!");
    }
}
