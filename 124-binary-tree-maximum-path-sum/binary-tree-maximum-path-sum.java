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
     int maxSum = Integer.MIN_VALUE;
    int max(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, max(root.left));
        int right = Math.max(max(root.right), 0);
        maxSum = Math.max(maxSum, right + left + root.val);
        return Math.max(left, right) + root.val;
    }
    public int maxPathSum(TreeNode root) {
       
        //maxSum = root.val;
        max(root);
        return maxSum;
    }
}