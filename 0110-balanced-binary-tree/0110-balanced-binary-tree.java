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
    public boolean isBalanced(TreeNode root) {

        if(root == null) return true;
            
        int left =dfs(root.left);
        int right = dfs(root.right);
        
        if(Math.abs(left- right) > 1){

            return false;
        }
        
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    private int dfs(TreeNode root){

        if(root == null) return 1;
        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.max(left,right) +1;
    }
}