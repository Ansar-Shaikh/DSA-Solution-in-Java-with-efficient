class SpiralMatrix {
    public static void SpiralMatrix(int matrix[][]) {
        int rowbegin = 0;
        int colbegin = 0;
        int rowend = matrix.length - 1;
        int colend = matrix[0].length - 1;
        
        while (rowbegin <= rowend && colbegin <= colend) {
            // Traversing left to right
            for (int j = colbegin; j <= colend; j++) {
                System.out.print(matrix[rowbegin][j] + " ");
            }
            rowbegin++;
            
            // Traversing top to bottom
            for (int j = rowbegin; j <= rowend; j++) {
                System.out.print(matrix[j][colend] + " ");
            }
            colend--;
            
            // Traversing right to left
            if (rowbegin <= rowend) {
                for (int j = colend; j >= colbegin; j--) {
                    System.out.print(matrix[rowend][j] + " ");
                }
            }
            rowend--;
            
            // Traversing bottom to top
            if (colbegin <= colend) {
                for (int j = rowend; j >= rowbegin; j--) {
                    System.out.print(matrix[j][colbegin] + " ");
                }
            }
            colbegin++;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},
            {21, 22, 23, 24}
        };
        SpiralMatrix(matrix);
        System.out.println("Hello World!");
    }
}
