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


    
    public boolean isValidBST(TreeNode root) {
        
      boolean res=  reccur(root,null,null);
        return res;
        
    }
    
    private boolean reccur(TreeNode root,Integer min, Integer max){
        
        if(root==null) return true;
        
        if(max !=null && root.val >= max) return false;
        if(min !=null && min >=root.val) return false;

        
    return reccur(root.left,min,root.val) &&
        reccur(root.right,root.val,max);
    
        
    }
}