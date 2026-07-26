class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
    
      int i=nums.length-1, j=nums.length-2,k=nums.length-3;
      int l=0, m=l+1;
      if(nums[i]*nums[j]*nums[k] > nums[l]*nums[m]*nums[i]){
               return nums[i]*nums[j]*nums[k];
      }  
      else{
        return nums[l]*nums[m]*nums[i];
      } 
     
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna