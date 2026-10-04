class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> stack=new Stack<>();
        int n=q.size();
        if (k > n) {
                  return q;
              }
        for(int i=1;i<=k;i++){
            stack.push(q.remove());
        }
        while(stack.size()>0){
            q.add(stack.pop());
        }
        for(int i=1;i<=n-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna