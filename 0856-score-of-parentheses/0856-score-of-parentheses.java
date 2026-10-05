class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> p=new Stack<>();
        Stack<Integer> q=new Stack<>();
        p.push('(');
        q.push(0);
        int j=1;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='('){
                p.push('(');
                q.push(0);
            }
            else if(ch==')'){
                p.pop();
                int score;
                if(q.peek()==0){
                    q.pop();
                    score=1;
                }
                else{
                   int t=q.pop();
                   score=2*t;

                }
                if(q.size()!=0){
                    int z=q.pop();
                    q.push(z+score);
                }
                else{
                    q.push(score);
                }
            }

            j++;
        }
        return q.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna