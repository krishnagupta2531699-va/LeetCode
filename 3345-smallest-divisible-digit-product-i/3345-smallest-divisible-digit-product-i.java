class Solution {
    public int smallestNumber(int n, int t) {
        while(true){ 
        int s=1;
        int k=n;
        int z;
       while(k!=0){
          z=k%10;
          s=s*z;
          k=k/10;
       }
       if(s%t==0){
           return n;
       }
       n++;
    }     
     
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna