class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> x = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int n = arr.length;

        stack.push(arr[n - 1]);
        x.add(-1);

        int i = n - 2;

        while (i >= 0) {

            while (stack.size() > 0 && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.size() == 0) {
                x.add(-1);
            } else {
                x.add(stack.peek());
            }

            stack.push(arr[i]);
            i--;
        }

        int j = 0;
        int k = x.size() - 1;

        while (j < k) {
            int temp = x.get(j);
            x.set(j, x.get(k));
            x.set(k, temp);
            j++;
            k--;
        }

        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna