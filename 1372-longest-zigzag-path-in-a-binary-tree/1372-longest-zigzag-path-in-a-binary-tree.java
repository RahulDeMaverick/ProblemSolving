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
    int max;
    public int longestZigZag(TreeNode root) {
        if (root == null) return -1;
        max =0;
        dfs(root,0,true);
        dfs(root,0,false);
        return max;
    }
    
    private void dfs(TreeNode root,int steps,boolean left){
        //base
        if(root ==null) return;
        
        max = Math.max(max, steps);
        
        //logic
        if(left){
            dfs(root.left,steps+1,false);
            dfs(root.right,1,true);
        }else{
            dfs(root.left,1,false);
            dfs(root.right,steps+1,true);
        }
        
    }
}