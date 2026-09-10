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
    void levelOrder(TreeNode root, List<List<Integer>> ans){

        if( root == null ){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while ( !q.isEmpty() ){
            int n = q.size();
            ArrayList<Integer> li = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode r = q.poll();
                li.add(r.val);

                if(r.left != null){
                    q.offer(r.left);
                }
                if(r.right != null){
                    q.offer(r.right);
                }
            }
            ans.add(new ArrayList<>(li));
        }

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, list);

        List<Integer> ans = new ArrayList<>();
        for(List<Integer> x : list){
            ans.add(x.get(x.size()-1));
        }
        return ans;
    }
}