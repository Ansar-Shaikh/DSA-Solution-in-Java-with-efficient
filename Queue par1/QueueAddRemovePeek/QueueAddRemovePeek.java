class QueueAddRemovePeek {
    static class Queue {
        static int size;
        static int arr[];
        static int rear;

        Queue(int n) {
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // Enqueue - adding element
        public void add(int data) {
            // Check if the queue is full
            if (rear == size - 1) {
                System.out.println("Queue is full:");
                return; // Return early to avoid adding an element
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0]; // Initial element is front
            // Front stays at the zeroth index, but elements swap one place ahead
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1; // Decrement rear
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}