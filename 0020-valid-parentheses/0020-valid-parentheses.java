class Solution {
    public boolean isValid(String s) {
        if(s.length()!=0){
            if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
        }
        Stack<Character> stack1=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
           if(ch=='(' || ch=='{' || ch=='['){
              stack1.push(ch);
           }
           else{
            if(stack1.size()==0){
                return false;
            }
             if(stack1.size()!=0){
                if(stack1.peek()=='(' && ch==')' || stack1.peek()=='{' && ch=='}' || stack1.peek()=='[' && ch==']'){
                    stack1.pop();
                }
                else{
                    return false;
                }
             }
           }
           i++;
        }
        if(stack1.size()==0) return true;
        else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna