import java.util.*;

class StackUsingLinkedList{

        // Node class to represent each node in the linked list
        static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class to manage stack operations using linked list
    static class Stack {
        private Node head;

        // Check if the stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Push an element onto the stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
