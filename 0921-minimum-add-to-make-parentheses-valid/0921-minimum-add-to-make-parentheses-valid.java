class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        int j=1;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(stack.size()!=0 && stack.peek()=='(' && ch==')'){
                
                    stack.pop();
                
            }
            else{
                stack.push(ch);
            }
            j++;
        }
        return stack.size();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna