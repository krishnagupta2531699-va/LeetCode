class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        int[] c={-1,-1};
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                c[0]=mid;
                hi=mid-1;
            }
            else if(nums[mid]<target){
               
                lo=mid+1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
        }
        lo=0;
        hi=nums.length-1;

            while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                c[1]=mid;
               lo=mid+1;
            }
            else if(nums[mid]<target){
               
                lo=mid+1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna