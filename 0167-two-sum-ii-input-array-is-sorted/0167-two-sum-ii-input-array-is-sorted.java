class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int i=0,j=nums.length-1;
        int[] c=new int[2];
        while(i<j){
            if(nums[i]+nums[j]==target){
              
                c[0]=i+1;
                c[1]=j+1;
                break;
            }
            else if(nums[i]+nums[j]<target) i++;
            else if(nums[i]+nums[j]>target) j--;
          
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna