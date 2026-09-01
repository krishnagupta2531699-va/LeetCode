class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }

        if (left == 1) {
           
            ListNode prev = null;
            ListNode curr = head;

            for (int i = 1; i <= right; i++) {
                ListNode f = curr.next;
                curr.next = prev;
                prev = curr;
                curr = f;
            }

            head.next = curr;
            return prev;
        }

        ListNode temp = head;

        for (int i = 1; i < left - 1; i++) {
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

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna