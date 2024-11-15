import java.util.*;

class D2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Enter the number of rows:");
        int rows = sc.nextInt();
        while (rows <= 0) {
            System.out.println("Please enter a positive integer for the number of rows:");
            rows = sc.nextInt();
        }

        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        while (cols <= 0) {
            System.out.println("Please enter a positive integer for the number of columns:");
            cols = sc.nextInt();
        }

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
		// for largest element 
		int largest=matrix[0][0];
		 int sum=0;
		for (int i=0;i<rows ;i++ )
		{
			for (int j=0;j<cols ;j++ )
			{
				sum+=matrix[i][j];
				if (matrix[i][j]>largest)
				{
					largest=matrix[i][j];
				}
			}
		}
		System.out.println("largest element is : "+largest);
		System.out.println("summation is element is : "+sum);

        sc.close();
    }
}
