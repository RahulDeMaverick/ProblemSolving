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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i =0;i<size;i++){
                TreeNode curr = q.poll();
                if(flag){
                    list.add(curr.val);
                }
                else{
                    list.add(0,curr.val);
                }

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null)  q.add(curr.right);

                
            }
            flag = !flag; 
            result.add(list);
        }
        return result;
    }
}