class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0;
        int j=0;
        Stack<Integer> stack = new Stack<>();
        while(i<pushed.length){
            stack.push(pushed[i]);
            if(stack.peek()==popped[j]){
                while(stack.size()!=0 && stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }
            }
            i++;
        }
        if(stack.size()==0) return true;
        else return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna