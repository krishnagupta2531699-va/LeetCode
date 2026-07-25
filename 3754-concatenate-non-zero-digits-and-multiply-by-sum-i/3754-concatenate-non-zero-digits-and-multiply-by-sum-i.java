class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        char[] arr=s.toCharArray();
        int store=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                continue;
            }
            else{
                int c=arr[i]-'0';
                sum+=c;
                store= store * 10 + c;
            }
        }
        return (long)sum*store;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna