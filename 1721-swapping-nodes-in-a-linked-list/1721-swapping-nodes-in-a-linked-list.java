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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int length=0;
        ListNode curr = head;
        
        while(curr != null){
            length++;
            curr = curr.next;
        }
        
        ListNode front = head;
        int i =1;
        while(i <k){
            front = front.next;
            i++;
        }
        i=1;
        ListNode end = head;
          while(i <=length-k){
            end = end.next;
              i++;
        }
        
        int temp = front.val;
        front.val = end.val;
        end.val = temp;
        return head;
    }
}