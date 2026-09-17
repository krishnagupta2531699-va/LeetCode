class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack1=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(stack1.size()==0){
                
                stack1.push(ch);
                i++;
            }
            else if(stack1.peek()==ch){
                i++;
            }
            else{
                stack1.push(ch);
                i++;
            }
        }
        while(stack1.size()>0){
            sb.append(stack1.pop());
        }
        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna