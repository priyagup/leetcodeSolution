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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; 

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverese the string 

        ListNode revs = null;
        while (slow != null){
            ListNode temp = slow.next;
            slow.next = revs; 
            revs = slow;
            slow = temp;
        }

        // compare

        ListNode first = head;
        ListNode second = revs;

        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next; 
            second = second.next;
        }
        return true;
    }
}