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
    public ListNode rotateRight(ListNode head, int k) {
    if (head==null||head.next==null) return head;
    ListNode dummy=new ListNode(0,head);
    ListNode fast=dummy,slow=dummy;

    int i;
    for (i=0;fast.next!=null;i++)//Get the total length 
    	fast=fast.next;
    
    
    System.out.print(fast.val);//fast =5
    for (int j=i-k%i;j>0;j--) //Get the i-n%i th node
    	{System.out.print(j);
            slow=slow.next;}
   
    
    fast.next=dummy.next; //fast.next =5.next = -1.next // making connection between 5 and 1
    dummy.next=slow.next;//-1.next = 3.next(4) // making connection between -1 and 4
    slow.next=null; //making 3.next to null
    
    return dummy.next; //return -1.next
    }
}