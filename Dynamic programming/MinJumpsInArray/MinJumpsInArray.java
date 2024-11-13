import java.util.*;

class MinJumpsInArray {
    
    // Utility function to print the dp array
    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    // Function to calculate minimum jumps
    public static int minJumps(int arr[]) {
        int n = arr.length;

        // Edge case: if array length is 1, no jumps needed
        if (n <= 1) return 0;

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0; // No jumps needed from the last index

        // Fill the dp array
        for (int i = n - 2; i >= 0; i--) {
            int step = arr[i];
            for (int j = i + 1; j <= i + step && j < n; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        // Print the dp array
        print(dp);

        // Return result
        return dp[0] == Integer.MAX_VALUE ? -1 : dp[0];
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};
        System.out.println("Min Jumps: " + minJumps(arr));
    }
}
