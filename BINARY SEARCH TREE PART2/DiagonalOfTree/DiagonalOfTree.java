import java.util.*;

class DiagonalOfTree {

    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> diagonal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        
        q.add(root); // initially add root element
        
        while (!q.isEmpty()) {
            Node curr = q.remove(); // remove the first element
            
            while (curr != null) {
                // Add current node to the answer list
                ans.add(curr.data);
                
                // If left child exists, add it to the queue
                if (curr.left != null) {
                    q.add(curr.left);
                }
                
                // Move to the right child
                curr = curr.right;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.right.left = new Node(4);
        root.right.left.left = new Node(7);
        root.right.right = new Node(5);
        root.right.right.right = new Node(6);
        
        ArrayList<Integer> ans = diagonal(root);
        
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Diagonal Traversal Element: " + ans.get(i));
        }
    }
}
