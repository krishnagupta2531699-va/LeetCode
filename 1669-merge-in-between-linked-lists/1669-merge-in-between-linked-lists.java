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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
              ListNode temp=list1;
              for(int i=0;i<a-1;i++){
                temp=temp.next;
              }
              ListNode t=temp.next;
              temp.next=list2;
              for(int i=a;i<b;i++){
                   t=t.next;
              }
              ListNode t1=t.next;
              temp=list2;
              while(temp.next!=null){
                temp=temp.next;
              }
              temp.next=t1;
              return list1;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna