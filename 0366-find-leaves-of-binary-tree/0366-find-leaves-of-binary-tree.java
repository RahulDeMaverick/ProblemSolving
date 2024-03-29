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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result  = new ArrayList<>();
        if(root == null) return result;
        dfs(root,result);
        return result;
        
    }
    
    private int dfs(TreeNode root,List<List<Integer>> result) {
        if(root == null) return -1;
        
        int level = Math.max(dfs(root.left,result),dfs(root.right,result))+1;
        
        if(result.size() <= level) { result.add(new ArrayList<>());}

            result.get(level).add(root.val);
        return level;
    }
}