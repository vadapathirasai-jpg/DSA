/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int vahttps://assets.leetcode.com/uploads/2021/01/14/flaten.jpg$0
 
 
 l) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNodhttps://assets.leetcode.com/uploads/2021/01/14/flaten.jpg$0e right) {
 *         this.val = val;https://assets.leetcode.com/uploads/2021/01/14/flaten.jpg$0
 *         this.left = left;
 *         this.right = right;https://assets.leetcode.com/uploads/2021/01/14/flaten.jpg$0
 *     }https://assets.leetcode.com/uploahttps://assets.leetcode.com/uploads/2021/01/14/flaten.jpg$0ds/2021/01/14/flaten.jpg$0
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while( curr != null ){
            if(curr.left != null){
                TreeNode temp = curr.right;
                
                curr.right = curr.left;
                curr.left = null;
                
                TreeNode prev = curr.right;
                while( prev.right != null){
                    prev = prev.right;
                }
                prev.right = temp;
            }
            curr = curr.right;
        }
    }
}