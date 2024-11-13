import java.util.*;

class dequeusingStack {
    static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        public static void push(int data) {
            deque.addLast(data);
        }

        public static int pop() {
            if (!deque.isEmpty()) {
                return deque.removeLast();
            } else {
                throw new NoSuchElementException("Stack is empty");
            }
        }

        public static int peek() {
            if (!deque.isEmpty()) {
                return deque.getLast();
            } else {
                throw new NoSuchElementException("Stack is empty");
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Peek is = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
