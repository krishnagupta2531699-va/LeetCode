class Solution {
    public char repeatedCharacter(String s) {
       
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return 'c';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna