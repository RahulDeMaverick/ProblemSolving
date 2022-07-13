/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        
        ImmutableListNode current = head;
        Stack<ImmutableListNode> st = new Stack<>();
        while(current!= null){
            st.push(current);
            current = current.getNext();
                
        }
        
        while(!st.isEmpty()){
            st.pop().printValue();
        }
    }
}