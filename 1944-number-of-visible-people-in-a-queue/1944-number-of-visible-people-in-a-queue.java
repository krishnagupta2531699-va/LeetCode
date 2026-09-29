class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        stack.push(heights[n-1]);
        int j=n-2;
        while(j>=0){
            int count=0;
            if(stack.peek()>heights[j]){
                count++;
                ans[j]=count;
                stack.push(heights[j]);
            }
            else if(stack.peek()<=heights[j]){
                while(stack.size()!=0  && stack.peek()<=heights[j]){
                    count++;
                    stack.pop();
                }
                if(stack.size()>0) count++;
                ans[j]=count;
               stack.push(heights[j]);
            }
            j--;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna