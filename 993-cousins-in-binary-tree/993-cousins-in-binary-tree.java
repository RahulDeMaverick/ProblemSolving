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
    TreeNode x_parent;
    TreeNode y_parent;
    int x_depth;
    int y_depth;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        helper(root,x,y,null,0);
        return x_parent != y_parent && x_depth == y_depth;
    }
    
    private void helper(TreeNode root, int x, int y,TreeNode parent,int depth){
        
        if(root == null) return;
        
        if(root.val ==x){
           x_parent = parent; 
            x_depth = depth;
        }
        
         if(root.val ==y){
           y_parent = parent; 
            y_depth = depth;
        }
        
        helper(root.left,x,y,root,depth+1);
        helper(root.right,x,y,root,depth+1);
    }
}