/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;https://assets.leetcode.com/uploads/2021/04/09/pathsum3-1-tree.jpg$0
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.vahttps://assets.leetcode.com/uploads/2021/04/09/pathsum3-1-tree.jpg$0l = val;
 *         this.left = left;
 *         this.right = right;https://assets.leetcode.com/uploads/2021/04/09/pathsum3-1-tree.jpg$0
 *     }
 * }
 */
class Solution {

    int currentPath(TreeNode root, long sum){
        if(root == null){
            return 0;
        }
        int count =0;
        if( (root.val ) == sum){
            count++;
        }
        count += currentPath(root.left, sum - root.val);
        count += currentPath(root.right, sum - root.val);

        return count;

    }
    
    public int pathSum(TreeNode root, int targetSum) {
           if(root == null){ return 0; }

           int count = currentPath(root, targetSum);

           count += pathSum(root.left, targetSum);
           count += pathSum(root.right, targetSum);

           return count;
    }
}