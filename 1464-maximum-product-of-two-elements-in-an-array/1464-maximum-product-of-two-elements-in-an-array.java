class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int n=nums.length;
      for(int i=0;i<n;i++){
        if(nums[i]>=max){
            smax=max;
            max=nums[i];
        }
        else if(nums[i]>smax && nums[i]!=max){
            smax=nums[i];
        } 
      }
      return (max-1)*(smax-1);
    
        
        
            
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna