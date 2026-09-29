class Solution {
    public static class Pair{
        int val;
        int index;
        Pair(int val,int index){
            this.val=val;
            this.index=index;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> x=new ArrayList<>();
        Stack<Pair> stack=new Stack<>();
        stack.push(new Pair(arr[0],0));
        x.add(1);
        int j=1;
        while(j<arr.length){
            if(arr[j]<stack.peek().val){
                x.add(j-stack.peek().index);
                stack.push(new Pair(arr[j],j));
            }
            else if(arr[j]>=stack.peek().val){
                while(stack.size()!=0 && arr[j]>=stack.peek().val){
                    stack.pop();
                }
                if(stack.size()==0){
                    x.add(j-(-1));
                    stack.push(new Pair(arr[j],j));
                }
                else{
                    x.add(j-stack.peek().index);
                    stack.push(new Pair(arr[j],j));
                }
            }
            j++;
        }
        return x;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna