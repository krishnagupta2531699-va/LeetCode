class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {

        int[] arr = new int[num1.length + num2.length];

        int i = 0, j = 0, k = 0;
        double mean=0.000;
        while(i < num1.length && j < num2.length){
            if(num1[i] < num2[j]){
                arr[k++] = num1[i++];
            }
            else{
                arr[k++] = num2[j++];
            }
        }

        while(i < num1.length){
            arr[k] = num1[i];
            i++;
            k++;
        }

        while(j < num2.length){
            arr[k] = num2[j];
            j++;
            k++;
        }

        int n = arr.length;

        if(n % 2 != 0){
            return (double)arr[n/2];
        }
        else{
           double sum=arr[(n/2)-1]+arr[(n/2)];
            mean=sum/2;
            return mean;
        }
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna