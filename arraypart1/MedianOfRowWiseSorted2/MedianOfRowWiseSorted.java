import java.util.Arrays;

class MedianOfRowWiseSorted {
    public static int median(int arr[][], int row, int col) {
        int[] flatArray = new int[row * col];
        int index = 0;

        // Flatten the 2D array into a 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flatArray[index++] = arr[i][j];
            }
        }

        // Sort the 1D array
        Arrays.sort(flatArray);

        // Find the median
        int mid = (row * col) / 2;
        return flatArray[mid];
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 5, 7, 8, 9},
            {2, 3, 5, 7, 8},
            {2, 5, 7, 8, 9}
        };
        int row = 3;
        int col = 5;
        System.out.println("Median of the array: " + median(arr, row, col));
    }
}
