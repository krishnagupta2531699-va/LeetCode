class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] freq = new int[256];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int count = freq[s.charAt(0) - 'a'];

        for(int i = 0; i < 256; i++) {
            if(freq[i] > 0 && freq[i] != count) {
                return false;
            }
        }

        return true;
    }
}











// class Solution {
//     public boolean areOccurrencesEqual(String s) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             if(map.containsKey(s.charAt(i))){
//                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
//             }
//             else{
//                 map.put(s.charAt(i),1);
//             }
//         }
//        int count = map.get(s.charAt(0));
//         for(char ele :map.keySet()){
//             if(count!=map.get(ele)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }





// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna