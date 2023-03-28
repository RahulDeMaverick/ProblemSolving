/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode result;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(original);
        q2.add(cloned);
        
        while(!q1.isEmpty()){
            TreeNode originalCurr = q1.poll();
            TreeNode clonedCurr = q2.poll();
            
            if(originalCurr == target) return clonedCurr;
            
            if(originalCurr.left != null){
                q1.add(originalCurr.left);
                q2.add(clonedCurr.left);
            }
            
               if(originalCurr.right != null){
                q1.add(originalCurr.right);
                q2.add(clonedCurr.right);
            }
            
        }
        return null;
    }

}