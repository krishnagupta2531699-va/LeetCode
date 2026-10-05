class Solution {
    public void rearrangeQueue(Queue<Integer> q) {

        Queue<Integer> d = new LinkedList<>();

        d.add(q.remove());

        while(q.size() != 1) {

            int n = q.size() / 2;

            for(int i = 1; i <= n; i++) {
                q.add(q.remove());
            }

            d.add(q.remove());
        }

        d.add(q.remove());

        while(!d.isEmpty()) {
            q.add(d.remove());
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna