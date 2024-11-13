class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MergedLinkedList {
    public Node head;

    private static Node GetMid(Node head) {
        Node slow = head;
        Node fast = head.next; // only difference is that in finding is cycle form or not
        while (fast != null && fast.next != null) {
            slow = slow.next; // step by only one
            fast = fast.next.next; // step by two
        }
        return slow; // mid can be slow
    }

    private static Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            // comparison between right half and left half
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        // remaining nodes from left half and right half
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next; // because we initialized with -1 at the start
    }

    public static Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = GetMid(head);
        Node rightHead = mid.next;
        mid.next = null; // break the list at mid
        // recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge sorted halves
        return merge(newLeft, newRight);
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergedLinkedList ll = new MergedLinkedList();
        ll.head = new Node(5);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(1);

        System.out.println("Original List:");
        ll.printList(ll.head);

        ll.head = mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.printList(ll.head);

        System.out.println("Hello World!");
    }
}
