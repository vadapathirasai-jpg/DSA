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
    boolean pathSum(TreeNode root, int sum, int target){
        if(root == null){
            return false;
        }
        // if(sum > target){
        //     return false;
        // }
        if(root.right == null && root.left == null){
            return sum + root.val == target;
        }
        boolean left = pathSum(root.left, sum + root.val, target);
        boolean right = pathSum(root.right, sum + root.val, target);

        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, 0, targetSum);
    }
}