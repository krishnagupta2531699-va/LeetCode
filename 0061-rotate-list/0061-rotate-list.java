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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode temp=head;

        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
       
        k=k%size;
        if(k==0) return head;
        
        temp=head;
        for(int i=1;i<(size-k);i++){
            temp=temp.next;

        }
        ListNode a=temp.next;
        temp.next=null;
        ListNode last = a;

        while (last.next != null) {
            last = last.next;
        }

        last.next = head;
        head = a;
        return head;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna