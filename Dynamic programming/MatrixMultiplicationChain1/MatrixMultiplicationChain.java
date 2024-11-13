import java.util.Arrays;

class MatrixMultiplicationChain {
    // Method to find the minimum number of multiplications
    public static int mcm(int[] arr, int i, int j, int[][] dp) {
        if (i == j) {
            return 0; // Base case: Single matrix has no cost
        }
        if (dp[i][j] != -1) {
            return dp[i][j]; // Return already computed cost
        }
        
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k, dp);
            int cost2 = mcm(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        
        dp[i][j] = ans; // Store the result in dp table
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        
        // Initialize memoization table with -1 (not computed)
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        System.out.println("Minimum number of multiplications is " + mcm(arr, 1, n - 1, dp));
    }
}
