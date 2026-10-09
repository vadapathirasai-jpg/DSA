/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png$0left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x;
  }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p , q);
        }
        return root;
    }
}