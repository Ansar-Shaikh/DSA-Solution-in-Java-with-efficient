class Balancedtree {
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

    private boolean istreebalanced = true;
    
    public boolean isBalanced(Node root) {
        dfs(root);
        return istreebalanced;
    }
    
    private int dfs(Node root) {
        if (root == null) return 0;
        int lh = dfs(root.left);
        int rh = dfs(root.right);
        if (Math.abs(lh - rh) > 1) {
            istreebalanced = false;
        }
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Balancedtree tree = new Balancedtree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        System.out.print(tree.isBalanced(root));
    }
}
