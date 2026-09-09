class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int k=0;k<arr.length;k++){
            String str=arr[k];
            char[] a=str.toCharArray();
            int i=0;
            int j=a.length-1;
            while(i<j){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            String str1=new String(a);
            arr[k]=str1;
        }
        return String.join(" ",arr);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna