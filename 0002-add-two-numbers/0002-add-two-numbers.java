
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=l1;
        ListNode zemp=l2;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int carry=0;
        int g=0;
        int sum=0;

        while(temp!=null || zemp!=null){
            int a=0;
            int b=0;
           if(temp!=null){
             a=temp.val;
           
           }
           if(zemp!=null){
            b=zemp.val;
           }
           sum=a+b+carry;
           g=sum%10;
           carry=sum/10;

            ListNode n=new ListNode(g);
            t.next=n;
            t=n;
            if(temp!=null)temp=temp.next;
            if(zemp!=null)zemp=zemp.next;
          


        }
        if(carry!=0){
            ListNode h=new ListNode(carry);
            t.next=h;
            t=h;
        }
        return dummy.next;
    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna