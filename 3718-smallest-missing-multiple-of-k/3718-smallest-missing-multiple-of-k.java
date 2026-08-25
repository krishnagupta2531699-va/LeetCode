class Solution {
    public int missingMultiple(int[] nums, int k) {
     int n=nums.length;
     HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<n;i++){
        set.add(nums[i]);
     }
     int i=k;
     while(true){
        if(!set.contains(i)){
            return i;
        }
        i+=k;
     }
    
    }
  
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna