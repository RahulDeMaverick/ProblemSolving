/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//TC : N Log(K)
/* 
At a given point of time we will always maintain k elemnts in the heap and when ever we poll we get the minimum elemnts 
so we gonna add it to resultant listnode
we will do this porcess this pq is empty
*/
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //create a pq and use comparator to compare the a.val to b.val 
        //min heap a.val -b.val
        //max.heap b.val - a.val
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val-b.val);
        
        //iterate to the list and add all the head pointer of the list to pq
        //if there are k list we will maintain k elements in the heap
        for(ListNode head: lists){
            if(head != null) pq.add(head);
        }
        //create a dummy node
        ListNode dummy = new ListNode(-1);
        //curr pointer pointing to dummy node
        ListNode curr= dummy;
        //iterate till pq is empty
        while(!pq.isEmpty()){
            //poll the min value 
            //since its a min heap the top element will be the minimum
            ListNode min = pq.poll();
            //make curr.next to min
            curr.next = min;
            //move the curr pointer to curr.next
            curr = curr.next;
            //check if min.next is null now add it to the pq
            if(min.next != null) pq.add(min.next);
            
        }
        //return dummy.next since head of dummy is -1
        return dummy.next;
    }
}