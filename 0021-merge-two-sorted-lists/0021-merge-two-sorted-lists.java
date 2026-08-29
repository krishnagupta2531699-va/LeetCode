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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null && list2 == null)return null;
            ListNode i=list1;
            ListNode j=list2;
            ListNode k=new ListNode(0);
            ListNode t=k;
            while(i!=null && j!=null){
                if(i.val<=j.val){
                     t.next=i;
                     t=i;
                     i=i.next;   
                }
                else if(j.val<=i.val){
                     t.next=j;
                     t=j;
                     j=j.next;
                }
                
            }
            if(i!=null){
                t.next=i;
            }
            else{
                t.next=j;
            }
            return k.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna