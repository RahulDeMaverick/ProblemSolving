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
        //three pass
        //first find the lenght of the list node
        int length=0;
        ListNode curr = head;
        
        //first pass find the length
        //move curr pointer to next and find the length
        while(curr != null){
            length++;
            curr = curr.next;
        }
        
        //find the Kth node from the front
        ListNode front = head;
        int i =1;
        while(i <k){
            front = front.next;
            i++;
        }
        
        //find the kth node from the end
        i=1;
        ListNode end = head;
          while(i <=length-k){
            end = end.next;
              i++;
        }
        //swapping the values from front and end
        
        int temp = front.val;
        front.val = end.val;
        end.val = temp;
        return head;
    }
}