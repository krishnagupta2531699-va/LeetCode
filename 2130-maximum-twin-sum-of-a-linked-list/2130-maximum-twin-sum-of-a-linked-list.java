class Solution {
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode h2 = slow.next;
        slow.next = null;

        ListNode p = null;
        ListNode c = h2;

        while (c != null) {
            ListNode f = c.next;
            c.next = p;
            p = c;
            c = f;
        }

        ListNode i = head;
        ListNode j = p;

        int ms = Integer.MIN_VALUE;

        while (i != null) {
            int s = i.val + j.val;

            if (s >= ms) {
                ms = s;
            }

            i = i.next;
            j = j.next;
        }

        return ms;
    }
}


// class Solution {
//     public int pairSum(ListNode head) {
//         ListNode dum1=new ListNode(-1);
//         ListNode t=dum1;
//         ListNode dum2=new ListNode(-2);
//         ListNode z=dum2;
//         ListNode i=head;
//         int l=0;
//         while(i!=null){
//              if(l%2==0){
//                 t.next=i;
//                 t=i;
//              }
//              else{
//                 z.next=i;
//                 z=i;
//              }
//              l++;
//              i=i.next;
//         }
//         t.next=null;
//         z.next=null;
//         ListNode a=dum1.next;
//         ListNode b=dum2.next;
//         ListNode prev=null;
//         ListNode curr=b;
//         ListNode next=curr.next;
//         while(curr!=null){
//          next=curr.next;
//          curr.next=prev;
//          prev=curr;
//          curr=next;
//       }
//         b=prev;
//         ListNode j=b;
//         ListNode k=a;
//         int max=Integer.MIN_VALUE;
//         while(j!=null){
//             if(k.val+j.val>max){
//                 max=k.val+j.val;
//             }
//             k=k.next;
//             j=j.next;
//         }
//         return max;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna