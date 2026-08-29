

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
        
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=k+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        temp=a;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head=a;
        return a;


    }
}








// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null) return head;
//         ListNode temp=head;

//         int size=0;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
       
//         k=k%size;
//         if(k==0) return head;
        
//         temp=head;
//         for(int i=1;i<(size-k);i++){
//             temp=temp.next;

//         }
//         ListNode a=temp.next;
//         temp.next=null;
//         ListNode last = a;

//         while (last.next != null) {
//             last = last.next;
//         }

//         last.next = head;
//         head = a;
//         return head;


//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna