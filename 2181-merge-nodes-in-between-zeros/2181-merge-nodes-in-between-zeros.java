
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dum=new ListNode(-1);
        ListNode t=dum;
        ListNode i=head;
        ListNode j=head.next;
        
        int sum=0;
        while(j!=null){
            if(i.val!=j.val){
                sum+=j.val;
                


            }
            else{
                ListNode d=new ListNode(sum);
                t.next=d;
                t=d;
                sum=0;
                i=j;

            }
            j=j.next;

        }
        t.next=null;
        return dum.next;
     
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna