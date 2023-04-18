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
    public int deepestLeavesSum(TreeNode root) {
        int result =0;
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size();
            result=0;
            for(int i =0;i<size;i++){
            TreeNode curr = q.poll();
                if(curr.left == null && curr.right == null) {
                    result += curr.val;
                }
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);              
            }
        }
        return result;
    }
}