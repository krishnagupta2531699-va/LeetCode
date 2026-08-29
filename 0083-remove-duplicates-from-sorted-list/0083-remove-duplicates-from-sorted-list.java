
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
         ListNode i=head;
         ListNode j=head;
         while(j!=null){
            if(i.val==j.val){
                j=j.next;
            }
            else{
                i.next=j;
                i=j;
                j=i.next;
            }
         }
         i.next=null;
         return head;
    }
}





// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode slow=head;
        
//         while(slow!=null && slow.next!=null){
//             if(slow.val==slow.next.val){
//                 slow.next=slow.next.next;
//             }
//             else{
//                 slow=slow.next;
//             }
//         }
//         return head;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna