class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printNode();
        ll.addFirst(2);
        ll.printNode();
        ll.addFirst(1);
        ll.printNode();
        ll.addLast(3);
        ll.printNode();
        ll.addLast(4);
        ll.printNode();
        ll.addAtPosition(5, 2); // Add 5 at position 2
        ll.printNode();
        ll.addAtPosition(6, 0); // Add 6 at the beginning
        ll.printNode();
        ll.addAtPosition(7, 6); // Add 7 at the end
        ll.printNode();
    }
}
