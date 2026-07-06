class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

  
        while (s.charAt(i) == ' ') {
            i--;
        }

        int j = i;

        
        while (j >= 0 && s.charAt(j) != ' ') {
            j--;
        }

        return i - j;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna