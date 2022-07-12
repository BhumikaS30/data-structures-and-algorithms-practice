package com.io.dsa.trees;

public class CheckForBST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node prev = null;

    static boolean isBST(Node root)
    {
       // return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        /**
         * This is using the in-order traversal, to check if result is sorted
         * If the previous value is > the current value means, the result is not sorted
         */
        if (root == null) return true;

        if (!isBST(root.left)) return false;

        if (prev != null && root.data <= prev.data) return false;

        prev = root;

        return isBST(root.right);
    }

    /**
     * This is search by range
     * Root can be between -infinity to +infinity
     * But nodes in the left sub-tree can only be < root (i.e max is root.data)
     * Similarly nodes in the right sub-tree can only be > root (i.e min is root.data)
     * If anywhere this is not true return false
     * Also, since BST doesn't allow equal values we do a root.data - 1 for max of the
     * left sub-tree and root.data + 1 for the right sub-tree.
     * @param root
     * @return
     */
    static boolean isBSTUtil(Node root, int min, int max) {

        if (root == null) return true;

        if (root.data < min || root.data > max) {
            return false;
        }

        return (isBSTUtil(root.left, min, root.data - 1) && isBSTUtil(root.right, root.data + 1, max));

    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node root = new Node(4);
        Node node4 = new Node(5);

        root.left = node2;
        node2.left = node1;
        node1.left = node;
        root.right = node4;

        System.out.println(isBST(root));
    }

}
