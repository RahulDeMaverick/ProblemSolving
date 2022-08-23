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
    boolean flag;
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
         flag =true;
        dfs (root.left, root.right);
        return flag;
              
    }
    
    private void dfs(TreeNode left,TreeNode right){

        //base
        if(left == null && right == null) return;

        if(left == null || right == null)
        {
            flag= false;
            return;
        }   
        
        if(left.val != right.val)
        {
            flag= false;
            return;
        }
        
        dfs(left.left, right.right);
        //stack.pop();
        dfs(left.right,right.left);
              //stack.pop();
          
    }
    
    
}