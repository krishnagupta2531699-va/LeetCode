class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            if (stack.size() == 0) {
                stack.push(temp);
                temp = temp.next;
            }
            else if (stack.peek().val < temp.val) {
                while (stack.size() > 0 && temp.val > stack.peek().val) {
                    stack.pop();
                }
                stack.push(temp);
                temp = temp.next;
            }
            else {
                stack.push(temp);
                temp = temp.next;
            }
        }

        ArrayList<ListNode> arr = new ArrayList<>();

        while (stack.size() > 0) {
            arr.add(stack.pop());
        }

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            int value = arr.get(i).val;
            arr.get(i).val = arr.get(j).val;
            arr.get(j).val = value;
            i++;
            j--;
        }

        for (i = 0; i < arr.size() - 1; i++) {
            arr.get(i).next = arr.get(i + 1);
        }

        arr.get(arr.size() - 1).next = null;

        return arr.get(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna