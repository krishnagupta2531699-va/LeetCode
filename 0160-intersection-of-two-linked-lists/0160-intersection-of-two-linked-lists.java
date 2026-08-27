/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int length1=0;
        int length2=0;
        while(temp1!=null){
            temp1=temp1.next;
            length1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            length2++;
        }
        ListNode fast;
        ListNode slow;
        if(length2>length1){
            fast=headB;
            slow=headA;
        }
        else{
            fast=headA;
            slow=headB;
        }
        int diff=length2-length1;
        for(int i=1;i<=Math.abs(diff);i++){
            fast=fast.next;
        }
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;


        }
        return slow;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna