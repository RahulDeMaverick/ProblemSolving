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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    
    private TreeNode helper(int[] nums,int left,int right){
        //left crosses right then return null
        if(left>right) return null;
        //mid is always the root node
        int mid = left +(right-left)/2;
        //create root node with mid 
        TreeNode root = new TreeNode(nums[mid]);
        //recursively calculate left and right nodes
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
    }
}