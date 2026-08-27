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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode small=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            small=small.next;
            fast=fast.next.next;
        }
        small.next=small.next.next;
        return head;
    }
}









// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//         if (head.next == null) return null;
//         ListNode small=head;
//         ListNode fast=head;
//         while(fast.next!=null && fast.next.next!=null){
//             small=small.next;
//             fast=fast.next.next;
//         }
//         small.next=small.next.next;
//         return head;
//     }
// }





// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//          if (head.next == null) return null;
//         ListNode small=head;
//         ListNode fast=head;
//         while(fast!=null && fast.next!=null){
//             small=small.next;
//             fast=fast.next.next;
//         }
//         ListNode temp=head;
//         while(temp.next!=small){
//             temp=temp.next;
//         }
//         temp.next=temp.next.next;
//         return head;
//     }
// }



// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//         if (head.next == null) return null;

//         ListNode temp = head;
//         int size = 0;

//         while (temp != null) {
//             temp = temp.next;
//             size++;
//         }

//         temp = head;

//         for (int i = 1; i <= size / 2 - 1; i++) {
//             temp = temp.next;
//         }

//         temp.next = temp.next.next;

//         return head;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna