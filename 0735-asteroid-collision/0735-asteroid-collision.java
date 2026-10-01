class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int j=0;
        while(j<arr.length){
            if(stack.size()==0) stack.push(arr[j]);
            else if(arr[j]<0){
                if(Math.abs(arr[j])>=stack.peek()){
                    while(stack.size()!=0 &&
                       stack.peek() > 0 && Math.abs(arr[j])>stack.peek()){
                        stack.pop();
                    }
                    if(stack.size()==0) stack.push(arr[j]);
                    else if(stack.peek()<0) stack.push(arr[j]);
                    else if (Math.abs(arr[j]) == stack.peek()) stack.pop();
                
                }
                
            }
            else{
                stack.push(arr[j]);
            }
            j++;
        }
        int[] brr=new int[stack.size()];
        int i=brr.length-1;
        while(stack.size()!=0){
            brr[i]=stack.pop();
            i--;
        }
        return brr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna