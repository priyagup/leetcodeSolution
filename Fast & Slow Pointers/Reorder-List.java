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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; 

        // 1. find the middle 
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. reverse the second half       
        ListNode revs = null;
        while (slow != null){
            ListNode temp = slow.next;
            slow.next = revs; 
            revs = slow; 
            slow = temp; // this is basically used as increment to next node .. and when slow == null while loop break.
        }
        
        // 3. Start from beginning and add element from the second half until second half is not finished
        slow = head; 

        while (revs != null && revs.next != null){
            ListNode temp1 = slow.next, temp2 = revs.next;
            slow.next = revs;
            revs.next = temp1;
            slow = temp1;
            revs = temp2;
        }
 
    }
}