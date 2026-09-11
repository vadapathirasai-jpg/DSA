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
    void pathSum(TreeNode root, int target, int sum, List<List<Integer>> ans, List<Integer> curr){
        if(root == null){
            return;
        }
        curr.add(root.val);
        if(root.right == null && root.left == null){
            if(sum + root.val == target){
                
                ans.add(new ArrayList<>(curr));
            } 
        }
        
        pathSum(root.right, target, sum + root.val, ans, curr);
        pathSum(root.left, target, sum + root.val, ans, curr);

        curr.remove(curr.size() -1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        pathSum(root, targetSum, 0, ans, new ArrayList<>());
        return ans;
    }
}