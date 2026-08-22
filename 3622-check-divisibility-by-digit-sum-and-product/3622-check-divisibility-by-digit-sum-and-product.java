class Solution {
    public boolean checkDivisibility(int n) {
        int z=n;
        int product=1,sum=0;
        while(n!=0){
            int r=n%10;
             sum+=r;
             product*=r;
             n=n/10;  
        }
       if(z%(sum+product)==0){
           return true;
       }
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna