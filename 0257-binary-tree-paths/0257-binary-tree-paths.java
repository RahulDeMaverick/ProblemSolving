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
    
    List<String> list;
    public List<String> binaryTreePaths(TreeNode root) { 
        list = new ArrayList<>();
        dfs(root,"");
        return list;
    }
    
    private void dfs(TreeNode root,String path){
        //base
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(path + root.val);
        }
        dfs(root.left,(path + root.val + "->"));
        dfs(root.right,(path + root.val + "->"));
        
    }
}