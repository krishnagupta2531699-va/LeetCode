class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {

        int[] arr = new int[num1.length + num2.length];

        int i = 0, j = 0, k = 0;

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
            return arr[n/2];
        }
        else{
            double mid1 = arr[n/2 - 1];
            double mid2 = arr[n/2];
            return (mid1 + mid2) / 2.0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna