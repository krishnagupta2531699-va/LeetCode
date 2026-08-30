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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int i=left-1;
        int j=right-1;
        while(i<=j){
            ListNode a=arr.get(i);
            ListNode b=arr.get(j);
            ListNode t=a;
            arr.set(i,b);
            arr.set(j,t);
            i++;
            j--;
        }
        for(i=0;i<arr.size();i++){
            if(i==arr.size()-1){
                arr.get(i).next=null;
            }
            else{
            arr.get(i).next=arr.get(i+1);}
        }
        return arr.get(0);
    }
}



// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         if(head==null || head.next==null) return head;
//         ListNode t=head;
//         for(int i=0;i<left-2;i++){
//             t=t.next;

//         }
//         ListNode before = t;
//         ListNode a = t.next;
        
      
//         t=head;
//         for(int i=0;i<right-1;i++){
//             t=t.next;
//         }
//         ListNode b=t;
//         ListNode after = b.next;
//         ListNode prev=after;
//         ListNode curr=a;
//         while (curr != after) {
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         before.next=prev;
//         return head;



//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna