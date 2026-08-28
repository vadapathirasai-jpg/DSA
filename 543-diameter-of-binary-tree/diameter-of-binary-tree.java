/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + (Math.max(height(root.left),height(root.right)));
    }
    int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        //Through root node
        int left = height(root.left);
        int right = height(root.right);
        int throughRoot = left + right;
        // what if its sub tree has more branch

        int leftSubTree = diameter(root.left);
        int rightSubTree = diameter(root.right);

        return Math.max(throughRoot, Math.max(leftSubTree, rightSubTree));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }
}