class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(stack.size()==0){
                stack.push(ch);
                i++;
            }
           else if(stack.peek()==ch){
                stack.pop();
                i++;
            }
            else{
                stack.push(ch);
                i++;
            }
        }
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna