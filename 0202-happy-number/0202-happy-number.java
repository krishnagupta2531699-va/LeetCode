class Solution {
    public boolean isHappy(int n) {
        while(true){
            double s=0;
            while(n!=0){
                s=s+Math.pow((n%10),2);
                n=n/10;
            }
            if(s==1) return true;
            if(s==4) return false;
            n=(int)s;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna