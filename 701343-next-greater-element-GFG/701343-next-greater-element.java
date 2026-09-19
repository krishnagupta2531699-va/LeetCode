class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> x= new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        stack.add(arr[n-1]);
        x.add(-1);
        int i=n-2;
        while(i>=0){
            if(arr[i]<stack.peek()){
                x.add(stack.peek());
                stack.push(arr[i]);
                i--;
            }
            else if(arr[i]>=stack.peek()){
                while(stack.size()>0 && arr[i]>=stack.peek()){
                    stack.pop();
                }
                if(stack.size()>0){
                    x.add(stack.peek());
                }
                else{
                    x.add(-1);
                }
                stack.push(arr[i]);
                i--;
            }
        }


       int j = 0;
       int k = x.size() - 1;

       while (j < k) {
           int temp = x.get(j);
           x.set(j, x.get(k));
           x.set(k, temp);

           j++;
           k--;
       }

       return x;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna