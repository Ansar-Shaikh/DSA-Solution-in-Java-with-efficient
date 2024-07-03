class PrefixSum {
    public static int[] PrefixSum(int arr[]) {
        int leng = arr.length;
        int prefix[] = new int[leng];
        prefix[0] = arr[0];
        for (int i = 1; i < leng; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix; // Return the prefix array directly
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 68, 84, 89, 78};
        int ans[] = PrefixSum(arr); // Store the result as an array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " "); // Print the array elements
        }
        System.out.println("\nHello World!");
    }
}
