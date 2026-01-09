public class BinarySearch_Tree {
    
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
    
    private Node root;
    
    public BinarySearch_Tree() {
        this.root = null;
    }
    
    // Recursive insertion
    public void insert(int data) {
        root = insertRecursive(root, data);
    }
    
    private Node insertRecursive(Node node, int data) {
        // Base case: if node is null, create new node
        if (node == null) {
            return new Node(data);
        }
        
        // Recursively insert in left or right subtree
        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }
        // If data equals node.data, no duplicates are inserted
        
        return node;
    }
    
    // Inorder traversal (Left, Root, Right) - prints sorted order
    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }
    
    private void inorderRecursive(Node node) {
        if (node == null) {
            return;
        }
        
        inorderRecursive(node.left);
        System.out.print(node.data + " ");
        inorderRecursive(node.right);
    }
    
    public static void main(String[] args) {
        BinarySearch_Tree bst = new BinarySearch_Tree();
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
       // System.out.println("Inorder Traversal:");
        //bst.inorder();
    }
}