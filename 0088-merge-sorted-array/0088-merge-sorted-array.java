class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int[] crr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(num1[i]<num2[j]){
                crr[k++]=num1[i++];
            }
            else{
                crr[k++]=num2[j++];
            }
        }
        for(;i<m;i++){
            crr[k++]=num1[i];
        }
        for(;j<n;j++){
            crr[k++]=num2[j];
        }
       for(int z = 0; z < crr.length; z++){
              num1[z] = crr[z];}
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna