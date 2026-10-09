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
    int leftHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return leftHeight(root.left) + 1;
    }
    int rightHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return rightHeight(root.right) + 1;
    }
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = leftHeight(root);
        int right = rightHeight(root);
        if(left == right){
            return (1 << left)-1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;

    }
}