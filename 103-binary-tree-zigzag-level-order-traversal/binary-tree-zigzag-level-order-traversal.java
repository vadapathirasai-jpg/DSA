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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lev = 0;
        while( !q.isEmpty() ){
            int n = q.size();
            ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++){
            TreeNode nn = q.poll();
            res.add(nn.val);

            if(nn.left != null){
                q.offer(nn.left);
            }
            if(nn.right != null){
                q.offer(nn.right);
            }
        }
        if(lev % 2 == 1){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = res.get(left);
                res.set(left, res.get(right));
                res.set(right, temp);
                left++;
                right--;
            }
        }
        ans.add(res);
        lev++;

        }
        return ans;
    }
}