class Solution {
    public char repeatedCharacter(String s) {
        char[] s1=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length;i++){
            if(set.contains(s1[i])){
                return s1[i];
            }
            set.add(s1[i]);
        }
        return 'c';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna