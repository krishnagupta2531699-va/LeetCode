class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna