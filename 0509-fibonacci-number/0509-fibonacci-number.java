class Solution {
    public int fib(int n) {
        if(n==0 ||  n==1) return n;
         int num=0;
         int num1=1;
         int num2;
         for(int i=2;i<=n;i++){
          
            num2=num+num1;
            num=num1;
            num1=num2;
         }
         return num1;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna