class Solution {
    public int maxProduct(int n) {
        String s=Integer.toString(n);
        char arr[]=s.toCharArray();
         int max=0;
        for(int i=0;i<arr.length;i++){
           int si=arr[i]-'0';
            for(int j=i+1;j<arr.length;j++){
                 int sj=arr[j]-'0';
                 int product=si*sj;
                 if(product>max){
                    max=product;
                 }
                
            }
        }
        return max;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna