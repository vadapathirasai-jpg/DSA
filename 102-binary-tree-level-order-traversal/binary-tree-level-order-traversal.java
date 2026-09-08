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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if( root == null ){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while( !q.isEmpty() ){
            int n = q.size();
            ArrayList<Integer> curr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode r = q.poll();
                curr.add(r.val);

                if( r.left != null)
                q.offer(r.left);

                if(r.right != null)
                q.offer(r.right);
            }
            ans.add(new ArrayList<>(curr));
        }
        return ans;
    }
}