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
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        ListNode temp=head;

        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int idx=size/2;
        temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp=temp.next;
        return temp;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna