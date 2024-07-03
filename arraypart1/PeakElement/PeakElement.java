class PeakElement {
    public static void findPeakElements(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i - 1] < arr[i]) && (i == n - 1 || arr[i] > arr[i + 1])) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 8, 9, 3, 7, 2};
        findPeakElements(arr);
    }
}
