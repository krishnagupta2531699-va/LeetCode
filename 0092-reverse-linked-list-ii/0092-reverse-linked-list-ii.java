class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }
        ListNode t = temp.next;
        ListNode k = t;
        for (int i = left; i < right; i++) {
            k = k.next;
        }
        ListNode c = k.next;
        ListNode prev = null;
        ListNode curr = t;
        while (curr != c) {
            ListNode f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }
        temp.next = prev;
        t.next = c;
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna