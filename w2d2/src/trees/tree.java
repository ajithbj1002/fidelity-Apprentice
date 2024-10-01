package trees;

class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class tree {

    static void preorderTraversal(Node node) {

        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(6);
        root.right.left = new Node(7);
        preorderTraversal(root);
    }
}

