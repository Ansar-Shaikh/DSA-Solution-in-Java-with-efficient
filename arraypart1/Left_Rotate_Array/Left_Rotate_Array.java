class Left_Rotate_Array {
    public static void Left_Rotate_Array(int arr[]) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Left_Rotate_Array(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nHello World!");
    }
}
