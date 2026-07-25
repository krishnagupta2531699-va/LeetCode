class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        int sum=0;
        while(n!=0){
            int d=n%10;
            if(d!=0){
                x=x*10+d;
                sum+=d;
            }
            n=n/10;
        }
         long rev = 0;
        while (x!=0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev*sum;
    }
}




// class Solution {
//     public long sumAndMultiply(int n) {
//         String s=Integer.toString(n);
//         char[] arr=s.toCharArray();
//         int store=0;
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]=='0'){
//                 continue;
//             }
//             else{
//                 int c=arr[i]-'0';
//                 sum+=c;
//                 store= store * 10 + c;
//             }
//         }
//         return (long)sum*store;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna