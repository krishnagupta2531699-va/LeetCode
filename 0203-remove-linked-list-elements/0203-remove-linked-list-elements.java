
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dum=new ListNode(-1);
        ListNode t=dum;
       
        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
                t.next=temp;
                t=temp;
            }
            temp=temp.next;
        }
        t.next=null;
        return dum.next;

    }
}




// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         while(head!=null){
//             if(head.val==val){
//                 head=head.next;
//             }
//             else{
//                 break;
//             }
//         }
//         ListNode temp=head;
       
//         while(temp!=null && temp.next!=null){
//             if(temp.next.val==val){
//                 temp.next=temp.next.next;
//             }
//             else{
//                 temp=temp.next;
//             }
           
//         }
//         return head;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna