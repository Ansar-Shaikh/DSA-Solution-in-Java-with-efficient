class Dutch_National_Flag_Algo {
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 1, 1, 1, 0, 2, 2, 0};
        int mid = 0, low = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(low, mid, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(mid, high, arr);
                high--;
            }
        }

        System.out.println("Array after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
