class Solution {
    public String reverseWords(String s) {
       s=s.trim();
       while(s.contains("  ")){
          s=s.replace("  "," ");
       }
       String[] arr=s.split(" ");
       int i=0;
       int j=arr.length-1;
       while(i<j){
        String temp = arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
       }
     
       return String.join(" ", arr);
      
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna