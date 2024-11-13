import java.util.*;

class HistogramInStack {
    public static void Histogram(int arr[]) {
        int maxarea = 0;
        int nsr[] = new int[arr.length]; // Next Smaller Right
        int nsl[] = new int[arr.length]; // Next Smaller Left

        // Calculate Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? arr.length : s.peek();
            s.push(i);
        }

        // Calculate Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // Calculate maximum area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1; // Correct width calculation
            int area = height * width;
            maxarea = Math.max(maxarea, area);
        }

        System.out.println("Maximum area is: " + maxarea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        Histogram(arr);
        System.out.println("Hello World!");
    }
}
