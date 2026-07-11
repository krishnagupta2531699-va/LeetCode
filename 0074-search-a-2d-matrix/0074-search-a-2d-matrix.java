class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length,n=arr[0].length;
        int lo=0,hi=m*n-1;
        int y=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int midrow=mid/n;
            int midcol=mid%n;
            if(arr[midrow][midcol]==target){
                return true;
            }
            else if(arr[midrow][midcol]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;

            }
            
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna