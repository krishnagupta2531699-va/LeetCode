class Solution {
    public int[][] transpose(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] brr=new int[n][m];
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[0].length;j++){
                brr[i][j]=arr[j][i];
            }
        }
        return brr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna