class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length() && (s+s).contains(goal)) return true;
        return  false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna