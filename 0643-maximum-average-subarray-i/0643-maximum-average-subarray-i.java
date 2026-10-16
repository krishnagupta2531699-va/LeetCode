class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int j=0;
        double average=0;
        int n=0;
        double max = -Double.MAX_VALUE;
        for(j=0;j<k;j++){
            sum+=nums[j];
            n++;
        }
        average=sum/n;
        max=Math.max(max,average);
        int i=0;
        while(j<nums.length){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            j++;
           
            average=sum/k;
            max=Math.max(max,average);

        }
        return max;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna