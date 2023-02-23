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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) { 
        inorder(root);  
        return diameter;
        
    }
    
    private int inorder(TreeNode root){
        //base
        if(root == null) return -1;        
        //logic
        int left = inorder(root.left);
        int right = inorder(root.right);  
        diameter = Math.max(diameter,(left+right)+2);

        
        return Math.max(left,right) +1;
        
    }
}