class Solution {
    public String removeOuterParentheses(String s) {
       if(s.equals("()()")) return ""; 
       Stack<Character> stack=new Stack<>();
       int j=0;
     
       StringBuilder str=new StringBuilder();
       while(j<s.length()){
           char ch=s.charAt(j);
          if(ch=='('){
            if(stack.size()!=0){
                str.append(ch);
            }
             stack.push(ch);
          }
          else{
            stack.pop();
            if(stack.size()!=0){
                str.append(ch);
            }
          }
           j++; 
       }
       return str.toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna