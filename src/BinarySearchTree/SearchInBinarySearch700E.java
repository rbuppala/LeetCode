package BinarySearchTree;
/*
700. Search in a Binary Search Tree

Given the root node of a binary search tree (BST) and a value.
You need to find the node in the BST that the node's value equals the given value.
Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
 */
public class SearchInBinarySearch700E {

    public static void main(String args[]) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(8);

        //TreeNode searchNode = search(node, 10);
        TreeNode searchNode = search(node, 8);
        System.out.println(searchNode.val);
    }

    static TreeNode search(TreeNode root, int target) {
        TreeNode node = null;
        if (root == null) return root;

        if (root.val == target) return root;

        if (target < root.val) {
            node = search(root.left, target);
        } else if (target > root.val) {
            node = search(root.right, target);
        }
        return node;
    }
}


class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val) {
        this.val = val;
    }
}