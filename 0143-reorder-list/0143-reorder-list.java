
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=a;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        ListNode i=head;
        ListNode j=prev;
        while(i!=null && j!=null){
            ListNode nexti=i.next;
            ListNode nextj=j.next;
            i.next=j;
            j.next=nexti;
            i=nexti;
            j=nextj;
        }
       
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna