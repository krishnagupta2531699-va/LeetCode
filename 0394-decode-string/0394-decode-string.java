class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        String current="";
        int num=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(Character.isDigit(ch)){
                num= num * 10 + ch-'0';
            }
            else if(Character.isLetter(ch)){
                current+=ch;
            }
            else if(ch=='['){
                stack.push(current);
                temp.push(num);
                num=0;
                current="";
            }
            else if(ch==']'){
                StringBuilder z=new StringBuilder();
                for(int i=0;i<temp.peek();i++){
                    z.append(current);
                }
                current=stack.peek()+z.toString();
                stack.pop();
                temp.pop();
            }
            j++;
        }
        return current;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna