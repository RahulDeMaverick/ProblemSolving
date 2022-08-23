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
//Dfs solution
//nodes should be of same level but different parents

//TC: o(n)
//SC: o(h) height of the tree
class Solution {
    TreeNode x_parent;
    TreeNode y_parent;
    int x_depth;
    int y_depth;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        helper(root,x,y,null,0);
        //return true if these conditon satisfies
        return x_parent != y_parent && x_depth == y_depth;
    }
    
    private void helper(TreeNode root, int x, int y,TreeNode parent,int depth){
        
        if(root == null) return;
        
        //if x is found set x parent and x depth;
        if(root.val ==x){
           x_parent = parent; 
            x_depth = depth;
        }
        
         //if x is found set y parent and y depth;
         if(root.val ==y){
           y_parent = parent; 
            y_depth = depth;
        }
        // optimization if x parent and y parent are found stop the recursion
        if(x_parent == null || y_parent == null) {
        helper(root.left,x,y,root,depth+1);
        helper(root.right,x,y,root,depth+1);
        }
    }
}