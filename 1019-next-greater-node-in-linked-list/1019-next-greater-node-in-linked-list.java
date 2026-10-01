class Solution {
    
    public int[] nextLargerNodes(ListNode head) {
        
        head = reverseList(head);

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];
        int k = arr.length - 1;

        arr[k] = 0;
        

        Stack<Integer> stack = new Stack<>();
        temp = head;

        while (temp != null) {

            if (stack.size() == 0) {
                stack.push(temp.val);
            }

            else if (temp.val >= stack.peek()) {

                while (stack.size() != 0 &&
                       temp.val >= stack.peek()) {
                    stack.pop();
                }

                if (stack.size() == 0) {
                    arr[k] = 0;
                }
                else {
                    arr[k] = stack.peek();
                }

                stack.push(temp.val);
            }

            else {
                arr[k] = stack.peek();
                stack.push(temp.val);
            }

            k--;
            temp = temp.next;
        }

        return arr;
    }

    public ListNode reverseList(ListNode head) {

        if (head == null)
            return null;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna