import java.util.ArrayList;
import java.util.NoSuchElementException;

class HeapdeleteAndRemove {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void add(int data) {
        arr.add(data);  // initially data;
        int x = arr.size() - 1; // child node index
        int par = (x - 1) / 2;  // parent node index
        while (x > 0 && arr.get(x) < arr.get(par)) {
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
            // pointer updation
            x = par;
            par = (x - 1) / 2;
        }
    }

    public static void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int min = i; // root node value to min to compare
        if (left < arr.size() && arr.get(min) > arr.get(left)) {
            min = left;
        }
        if (right < arr.size() && arr.get(min) > arr.get(right)) {
            min = right;
        }
        // swap min and root
        if (min != i) {
            int temp = arr.get(min);
            arr.set(min, arr.get(i));
            arr.set(i, temp);
            heapify(min);
        }
    }

    public static int remove() {
        if (arr.size() == 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        int data = arr.get(0);
        // swap between first and last element
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);
        // remove last index
        arr.remove(arr.size() - 1);
        // maintain heap property
        heapify(0); // index give to property
        return data;
    }

    public static boolean isEmpty() {
        return arr.size() == 0;
    }

    public static int peek() {
        if (arr.size() == 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        return arr.get(0);
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(1);
        pq.add(5);
        pq.add(3);
        pq.add(9);
        pq.add(2);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek() + " ");
            pq.remove();
        }
    }
}
