/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// can solve using hashset by adding the refereces of the nodes but it takes space o(N)
//TC: o(N)
//SC: o(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //flag to detect the cycle
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        
        // move slow pointer by one and fast pointer by two if both of them meet then its a cycle
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            //if slow and fast meet each other then there is a cycle
            //set the flag as true and break the loop;
            if(slow == fast)
            { flag = true;
                break;
            }
        }
        //after the first while if flag is false then there is no cyle no need to proceed further just return null means no cycle
        if(!flag) return null;
        // move the slow pointer to head
        slow = head;
        //iterate till fast and slow pointer meet each other
        // move both the pointers by one the place both of them meet is the place of where cycle begins
        //a+ b = a+b+b+c
        //2(a+b)= a+2b+c
        //2a+2b = a+2b+c
        //a=c;
        while(slow !=fast){
            slow= slow.next;
            fast= fast.next;
        }
        //return either slow pointer or fast pointer;
        return slow;
    }
}