class PeakElement {
    public static int FindPeakEle(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            }

            // If the left neighbor is greater, then there must be a peak on the left side
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            }

            // If the right neighbor is greater, then there must be a peak on the right side
            else {
                low = mid + 1;
            }
        }

        return -1; // This should never be reached if input array always has a peak
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};

        int peakIndex = FindPeakEle(arr);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}
