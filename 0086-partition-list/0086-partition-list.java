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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode dum1=new ListNode(-1);
        ListNode t=dum1;
        ListNode dum2=new ListNode(-2);
        ListNode z=dum2;
        ListNode i=head;
        while(i!=null){
            if(i.val<x){
                t.next=i;
                t=i;
            }
            else if(i.val>=x){
               z.next=i;
               z=i;
            }
            i=i.next;

        }
        z.next=null;
        t.next=dum2.next;
        return dum1.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna