class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListRemoveLAST_node {
    public Node head;


    public Node tail;
    public int size;

    public LinkedListRemoveLAST_node() {
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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
        size++;
    }

    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
	public int itSearch(int   key){
		Node temp=head;
		int idx=0;
		while (temp !=null)
		{
			if (temp.data==key)
			{
				return idx;
			}
			temp=temp.next;
			idx++;
		}
		return -1; // key not found 
	}

    public static void main(String[] args) {
        LinkedListRemoveLAST_node ll = new LinkedListRemoveLAST_node();
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
        System.out.println(ll.removeFirst());
        ll.printNode();
        System.out.println(ll.removeLast());
        ll.printNode();
		int key=10;
		System.out.println("searching a"+ key +"is :"+ll.itSearch(key));
        System.out.println("Size of linked list: " + ll.size);
    }
}
