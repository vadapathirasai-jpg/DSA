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
    // List<Integer> ans = new ArrayList<>();
    void inOrder(TreeNode root){
        if( root == null ){
            return;
        }
        inOrder(root.left);
        ans.offer(root.val);
        inOrder(root.right);
    }
    PriorityQueue<Integer> ans = new PriorityQueue<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        for(int i = 0; i < k-1; i++){
            ans.poll();
        }
        return ans.poll();
    }
}