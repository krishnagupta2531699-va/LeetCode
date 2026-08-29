/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 !=nu*     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode b=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next; 
           
            if(slow==fast){
                while(b!=slow){
                     slow=slow.next;
                     b=b.next;
                    
                }
                 return b;
            }
            
             
        }
        return null;
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna