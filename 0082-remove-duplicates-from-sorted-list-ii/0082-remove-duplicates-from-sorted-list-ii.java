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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode d=new ListNode(0);
        ListNode i=head;
        ListNode t=d;
        while(i!=null){
             if(i.next!=null && i.val==i.next.val){
                 ListNode j=i.next;
                while (j != null && j.val == i.val) {
                     j=j.next;
                 }
                 i=j;
                 t.next=i;

             }
             else{
                t.next=i;
                t=i;
                i=i.next;
             }
        }
        return d.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna