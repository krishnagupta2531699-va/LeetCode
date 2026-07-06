class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int pal=x;
        int reverse=0;
        while(x!=0){
              int r=x%10;
            reverse=reverse*10+r;
            x=x/10;
       
        }
        if(pal==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna