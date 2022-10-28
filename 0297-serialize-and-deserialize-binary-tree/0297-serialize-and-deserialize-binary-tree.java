/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    //serealizing is converting treenode in to string and desearizing is converting string to tree node
    // this is BFS ways of doing can be done in DFS as well

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        //create a stringbuilder
        StringBuilder sb = new StringBuilder();
        //create a queue with treenode
        Queue<TreeNode> q = new LinkedList<>();
        //add root to the queue
        q.add(root);
        //iterate till the q is empty
        while(!q.isEmpty()){
            //poll the current node
            TreeNode curr = q.poll();
            //if curr node is null then append "#" as given in the problem statement
            if(curr == null){
                sb.append("#");
            }else{
                //else append curr val to the string builder and add the curr left and curr right to the queue
                sb.append(curr.val);
                q.add(curr.left);
                q.add(curr.right);
            }
            //append ,
            sb.append(",");
        }
        //return sb to string;
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0) return null;
        //split the data based on , and add to strArr
        String[] strArr = data.split(",");
        //initate index =0
        int idx = 0;
        //initate a tree node root and add index [0] to it
        TreeNode root = new TreeNode(Integer.parseInt(strArr[idx]));
        //create a queue
        Queue<TreeNode> q = new LinkedList<>();
        //after adding first idx to root increment the index
        idx++;
        //add root to the queue
        q.add(root);
       // iterate till idx is less than strArr lenght
        while(!q.isEmpty() && idx < strArr.length){
            //get curr node
            TreeNode curr = q.poll();
            //if the str[idx] is not null then add to left node and add to the queue
            if(!strArr[idx].equals("#")){
                curr.left = new TreeNode(Integer.parseInt(strArr[idx]));
                q.add(curr.left);
            }
            //increment the idx this will handle the null case, if we have null in the arr we just increment the index with out add to treenode
            idx++;
            //same step for right node
            if(!strArr[idx].equals("#")){
                curr.right = new TreeNode(Integer.parseInt(strArr[idx]));
                q.add(curr.right);   
            }   
            idx++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));