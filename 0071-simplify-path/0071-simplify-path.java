class Solution {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");
        int i=0;
        Stack<String> stack=new Stack<>();
        while(i<arr.length){
            String s=arr[i];
            if(s.equals("")){
                i++;
            }
            else if(s.equals("..")){
                if(stack.size()>0) stack.pop();
                i++;
            }
            else if(s.equals(".")){
                
                i++;
            }
            else{
                stack.push(s);
                i++;
            }
        }
        Stack<String> temp = new Stack<>();
         while (stack.size() != 0) {
            temp.push(stack.pop());
        }
        StringBuilder sb=new StringBuilder();
        while(temp.size()!=0){
            sb.append("/");
            sb.append(temp.pop());
        }
        if (sb.length() == 0) {
           return "/";
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna