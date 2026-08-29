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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)  return head;
        ListNode dum1=new ListNode(-1);
        ListNode dum2=new ListNode(-2);
        ListNode t=dum1;
        ListNode z=dum2;
        ListNode i=head;
        int l=0;
        while (i != null) {
            ListNode next = i.next;
            i.next = null;

            if (l % 2 == 0) {
                t.next = i;
                t = i;
            } else {
                z.next = i;
                z = i;
            }

            l++;
            i = next;
        }

        ListNode a=dum2.next;
        ListNode b=dum1.next;
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        while(a!=null && b!=null){
            p.next=a;
            p=a;
            a=a.next;

            p.next=b;
            p=b;
            b=b.next;
        }
        if(a!=null){
            p.next=a;
        }
        if(b!=null){
            p.next=b;
        }
       return dummy.next;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna