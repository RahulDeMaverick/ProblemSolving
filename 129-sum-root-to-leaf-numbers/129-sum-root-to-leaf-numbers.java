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
    int result;
    public int sumNumbers(TreeNode root) {
        result=0;
        helper(root,0);
        return result;
    }
    
    private void helper(TreeNode root,int curr){
        
        if(root== null) return;
        curr = curr*10+root.val;
        System.out.println(root.val);
        System.out.println(curr);
        if(root.left== null && root.right== null) {
            result+= curr;
        }
        //base
        
        //logic
        helper(root.left,curr);
        helper(root.right,curr);
        
        
    }
}