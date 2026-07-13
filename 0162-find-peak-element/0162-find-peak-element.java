class Solution {
    public int findPeakElement(int[] arr) {
        int lo=0,hi=arr.length-1,mid=0;
        while(lo<hi){
           mid=lo+(hi-lo)/2;
            
           if(arr[mid]>arr[mid+1]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna