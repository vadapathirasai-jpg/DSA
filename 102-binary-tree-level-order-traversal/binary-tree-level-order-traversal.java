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
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.add(root);

        while( !q.isEmpty() ){
            int n = q.size();
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode nn = q.poll();

                res.add(nn.val);
                if(nn.left != null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
            }
            ans.add(res);
        } 
        return ans;
    }
}