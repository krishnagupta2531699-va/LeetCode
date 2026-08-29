
class Solution {
    public ListNode swapPairs(ListNode head) {
         if (head == null || head.next == null)
            return head;
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        for(int i=0;i<arr.size()-1;i+=2){
            ListNode t=arr.get(i);
            arr.set(i,arr.get(i+1));
            arr.set(i+1,t);
        }
        for(int i=0;i<arr.size()-1;i++){
            arr.get(i).next=arr.get(i+1);
        }
        arr.get(arr.size()-1).next=null;
        return arr.get(0);
    }
}




// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if(head==null || head.next==null)  return head;
//         ListNode dum1=new ListNode(-1);
//         ListNode dum2=new ListNode(-2);
//         ListNode t=dum1;
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
//         t.next = null;
//         z.next = null;
//         ListNode a=dum2.next;
//         ListNode b=dum1.next;
//         ListNode dummy=new ListNode(-1);
//         ListNode p=dummy;
//         while(a!=null && b!=null){
//             p.next=a;
//             p=a;
//             a=a.next;

//             p.next=b;
//             p=b;
//             b=b.next;
//         }
//         if(a!=null){
//             p.next=a;
//         }
//         if(b!=null){
//             p.next=b;
//         }
//        return dummy.next;
        
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna