class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        int k=0;
        Stack<Integer> stack=new Stack<>();
        int j=nums.length-1;
        while(j>=0){
            stack.push(nums[j]);
            j--;
        }
        j=nums.length-1;
        while(j>=0){
            if(stack.peek()>nums[j]){
                arr[k]=stack.peek();
                k++;
                stack.push(nums[j]);
            }
            else if(nums[j]>=stack.peek()){
                while(stack.size()!=0 && nums[j]>=stack.peek()){
                    stack.pop();
                }
                if(stack.size()==0){
                    arr[k]=-1;
                    k++;
                    stack.push(nums[j]);
                
                }
                else{
                    arr[k]=stack.peek();
                    k++;
                    stack.push(nums[j]);
                }
            }
            j--;
        }

        int i=0;
        int z=arr.length-1;
        while(i<z){
            int temp=arr[i];
            arr[i]=arr[z];
            arr[z]=temp;
            i++;
            z--;
        }
        return arr;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna