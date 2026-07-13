class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1) return 0;
         int max=Integer.MIN_VALUE;
         int idx=-1;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                idx=i;
                max=arr[i];

            }
         }
         return idx;
        
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna