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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int hl = 0;
        int hr = 0;
        for(TreeNode i = root; i != null; i = i.left){
            hl++;
        }
        for(TreeNode i = root; i != null; i = i.right){
            hr++;
        }
        if(hl == hr){
            return (1 << hl) - 1;
        }
        return 1 + countNodes(root.right) + countNodes(root.left);
    }
}