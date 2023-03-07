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

// The solution for this problem is first find the mid of the list
//reverse the second half of the list
class Solution {
    public void reorderList(ListNode head) {
        
        //find mid of the list
         ListNode slow = head;
         ListNode fast = head;
        
        //to find mid move the slow pointer by 1 and fast pinter by two 
        // fast.next is for odd sized list and fast.next.next is for even sized list
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;      
        }
        
        //reverse the list and point head of the reversed list to fast pointer
        fast = reverseList(slow.next);
        // make the slow pointer 
        slow.next = null;
        slow = head;
        //merging two lists
        
        while(fast != null){
            ListNode temp = slow.next;
            slow.next = fast;
            fast = fast.next;
            slow.next.next = temp;
            slow = temp;          
        }   
    }    
    
        //reverse the second half of the list 
        public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;    
        }   
        head = prev;
        return head;
    }
}