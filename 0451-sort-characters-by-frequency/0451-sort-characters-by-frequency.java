class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                list.add((char)(i));
            }
        }
        StringBuilder m= new StringBuilder();
        while(!list.isEmpty()){
            int max=0;
            char c=' ';
            for(int i=0;i<list.size();i++){
                char ch=list.get(i);
                if(freq[ch]>max){
                    max=freq[ch];
                    c=ch;
                }
            }
            for(int i=0;i<max;i++){
                m.append(c);
            }
            list.remove(Character.valueOf(c));
        }
        return m.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna