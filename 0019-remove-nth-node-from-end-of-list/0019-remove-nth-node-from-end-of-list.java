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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode temp = head;
        while(temp !=null)
        {
            count++;
            temp = temp.next;
        }
        
        if( n== count)
        {
           
            return head.next;
        }
        int steps = count - n;
        ListNode curr = head;
        ListNode prev = null;

       
        while(steps-->0 )
        {
            prev = curr;
             curr=curr.next;
        }
        prev.next = curr.next;
        

        return head;
    }
}