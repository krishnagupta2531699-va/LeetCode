class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
           int[] arr= new int[num1.length+num2.length];
           int i=0,j=0,k=0;
           while(i<num1.length && j<num2.length){
               if(num1[i]<num2[j]){
                  arr[k++]=num1[i++];
               }
               else{
                   arr[k++]=num2[j++];
               }
               
           }
           for(;i<num1.length;i++){
             arr[k++]=num1[i];
           }
           for(;j<num2.length;j++){
            arr[k++]=num2[j];
           }

           int n=arr.length;
           
           if(n%2!=0){
            int  midIndex=n/2;
              return arr[midIndex];
           }
           else{
              double mid1=arr[n/2-1];
              double mid2=arr[n/2];
              double median=(mid1+mid2)/2;
              return median;
           }
           
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna