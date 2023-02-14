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
    public int maxDepth(TreeNode root) {
        
        return inorder(root);
        
    }
    
    private int inorder(TreeNode root){
        //base
        if(root == null) return 0;
        
        //logic
        int left = inorder(root.left);
        
        int right = inorder(root.right);
        
        return Math.max(left,right) +1;
    
        
        
        
    }
}