class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(stack.size()==0) stack.push(ch);
            else if(ch>='A' && ch<='Z'){
               char t = (char)(ch + 32);
                if(t==stack.peek()) stack.pop();
                else stack.push(ch);
            }
            else if(ch>='a' && ch<='z'){
                char t = (char)(ch - 32);
                if(t==stack.peek()) stack.pop();
                else stack.push(ch);
            }

            j++;
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()!=0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna