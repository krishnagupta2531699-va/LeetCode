class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
         Stack<Integer> stack=new Stack<>();
             
        
              while(q.size()!=0){
                  stack.push(q.peek());
                  q.remove();
              }
              
              while(stack.size()>0){
                  q.add(stack.pop());
              }
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna