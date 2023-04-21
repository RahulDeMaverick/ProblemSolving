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
    
        class Node {
        TreeNode node;
        int idx;
        Node(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    //int width;
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int  width = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root,0));
        
        while(!q.isEmpty()){
            int size = q.size();
            int start =0;
            int end =0;
            for(int i =0;i<size;i++){
                Node curr = q.poll();
                int index = curr.idx;
                if(i == 0) start = index;
                if(i == size-1) end = index;
                if(curr.node.left != null) q.add(new Node(curr.node.left,2*curr.idx));
                if(curr.node.right != null) q.add(new Node(curr.node.right,2*curr.idx+1));
            }
            width = Math.max(width, end - start + 1);
        }
        
        return width;
    }
    
}