import java.util.*;

class NextGreaterEleInStack {
    public static void main(String[] args) {
        int arr[] = {6,7,3,2,5};
        int nextgreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            // While stack is not empty and the top of the stack is less than or equal to the current element
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // If stack is empty, there is no greater element
            if (s.isEmpty()) {
                nextgreater[i] = -1;
            } else {
                // The top of the stack is the next greater element
                nextgreater[i] = arr[s.peek()];
            }
            // Push the current element index onto the stack
            s.push(i);
        }
        
        // Print the next greater elements
        for (int i = 0; i < nextgreater.length; i++) {
            System.out.print(nextgreater[i] + " ");
        }
    }
}
