/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int va
 
 l) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
       this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < inOrder.length; i++){
            mp.put(inOrder[i], i);
        }
    TreeNode root = Build(preOrder, 0, preOrder.length - 1, inOrder, 0 , inOrder.length - 1, mp);
    return root;
    }
    TreeNode Build(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, HashMap<Integer, Integer> mp){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preStart]);

        int inRoot = mp.get(preOrder[preStart]);
        int numLeft = inRoot - inStart;

        root.left = Build(preOrder, preStart + 1, preStart + numLeft, inOrder, inStart, inRoot - 1, mp);

        root.right = Build(preOrder, preStart + numLeft + 1, preEnd, inOrder, inRoot + 1, inEnd, mp);

        return root;
    }
}