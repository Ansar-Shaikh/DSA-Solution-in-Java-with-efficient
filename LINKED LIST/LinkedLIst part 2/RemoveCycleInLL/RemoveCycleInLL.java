class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveCycleInLL {
    static Node head;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle is found in ll
            }
        }
        return false; // cycle is not found
    }

    public static void RemoveCycle() {
        // detecting cycle is formed or not 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return;
        }

        // meeting slow and fast
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // last node found
        prev.next = null;
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(5);
        head.next.next.next.next = temp;

        System.out.println("Cycle is found or not: " + isCycle());
        RemoveCycle();
        System.out.println("Cycle is removed or not: " + isCycle());
    }
}
