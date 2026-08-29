
class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null) return false;
        if (head.next == null) return true;

        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int s = size / 2;
        temp = head;

      
        for (int i = 0; i < s - 1; i++) {
            temp = temp.next;
        }

        ListNode a;

      
        if (size % 2 != 0) {
            a = temp.next.next;
        } else {
            a = temp.next;
        }

       
        ListNode curr = a;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        a = prev;

      
        ListNode p = head;
        ListNode q = a;

        while (q != null) {
            if (p.val != q.val) {
                return false;
            }

            p = p.next;
            q = q.next;
        }

        return true;
    }
}


// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             arr.add(temp.val);
//             temp=temp.next;
//         }
//         int i=0,j=arr.size()-1;
//         while(i<j){
//             if(arr.get(i)!=arr.get(j)) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna