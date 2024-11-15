class CircularQueueUsingAddRemovePeek 
	{
    static class Queue {
        static int size;
        static int arr[];
        static int rear;
		static int front;

        Queue(int n) {
            arr = new int[n];
            rear = -1;
			front=-1;
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1  && front ==-1;
        }

       public static boolean isfull(){
		return (rear+1 % size)== front;
       }

        // Enqueue - adding element
        public void add(int data) {
            // Check if the queue is full
            if (isfull) {
                System.out.println("Queue is full:");
                return; // Return early to avoid adding an element
            }
			if (front==-1)
			{
				front=0;
			}
            rear = (rear + 1)% size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front]; // Initial element is front
			if (front ==rear)// last element rhaa to oo delete krneke badh front and rear ko -1 deeee
			{
				front=rear=-1;
			}
			else{
				front=(front+1) % size;
			}
			return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
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