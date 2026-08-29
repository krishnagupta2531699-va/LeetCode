
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int n=arr.size();
        for(int i=n-1;i>=1;i--){
            arr.get(i).next=arr.get(i-1);
        }
        arr.get(0).next=null;
        return arr.get(n-1);
    }
}





// class Solution {
//     public ListNode reverseList(ListNode head) {
//       if(head==null) return null;
//       ListNode prev=null;
//       ListNode curr=head;
//       ListNode next=curr.next;
//       while(curr!=null){
//          next=curr.next;
//          curr.next=prev;
//          prev=curr;
//          curr=next;
//       }
//       return prev;
      
      

//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna