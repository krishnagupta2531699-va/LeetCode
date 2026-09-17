class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i<operations.length){
            String ch=operations[i];
            if(!ch.equals("C") && !ch.equals("D") && !ch.equals("+")){
                int x=Integer.parseInt(ch);
                stack.push(x);
                i++;
            }
            else if(ch.equals("C")){
                stack.pop();
                i++;

            }
            else if(ch.equals("D")){
                stack.push(2*stack.peek());
                i++;
            }
            else if(ch.equals("+")){
                int x=stack.peek();
                stack.pop();
                
                int y=stack.peek();
                stack.push(x);
                stack.push(x+y);
                i++;
            }
        }
        int[] arr=new int[stack.size()];
        int j=0;
        while(stack.size()>0){
            arr[j]=stack.pop();
            j++;
        }
        int sum=0;
        for(int k=0;k<arr.length;k++){
            sum+=arr[k];
        }
        return sum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna