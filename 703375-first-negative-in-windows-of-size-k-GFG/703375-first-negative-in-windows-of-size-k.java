class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int n = arr.length;

        // Store indices of all negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        int j = 0;

        while (j < n - k + 1) {

          
            while (q.size()!=0 && q.peek() < j) {
                q.remove();
            }

          
            if (q.size()!=0 && q.peek() <= j + k - 1) {
                list.add(arr[q.peek()]);
            } else {
                list.add(0);
            }

            j++;
        }

        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna