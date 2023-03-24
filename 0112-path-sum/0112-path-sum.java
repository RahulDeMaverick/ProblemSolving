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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0);
        return flag;
        
    }
    
    private void helper (TreeNode root, int targetSum,int i){
        if(root == null) return;
        
        i += root.val;
        
        if(i == targetSum && root.left == null && root.right ==null){
            flag =true;
        }
        
        helper(root.left,targetSum,i);
        helper(root.right,targetSum,i);
        
    }
}