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
    public TreeNode invertTree(TreeNode root) {
        
        //recurrsive solution
        
        //base condition
        if(root == null) return null;
        
        //right traversal
        TreeNode right = invertTree(root.right);
        //left traversal
        TreeNode left = invertTree(root.left);
        
        //assign right side tree to root.left 
        root.left = right;
        //assign left side tree to root.right 
        root.right = left;
        return root;
        
    }
}