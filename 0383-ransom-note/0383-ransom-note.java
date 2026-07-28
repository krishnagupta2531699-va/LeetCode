class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int index=ransomNote.charAt(i)-'a';
            if(freq[index]==0){
                return false;
            }
            freq[index]--;
        }
        return true;
    }
}




// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<magazine.length();i++){
//             char ch=magazine.charAt(i);
            
//             if(map.containsKey(ch)){
//                     map.put(ch,map.get(ch)+1);
//             }
//             else map.put(ch,1);
//         }
//         for(int i=0;i<ransomNote.length();i++){
//             char ch=ransomNote.charAt(i);
         
//             if(!map.containsKey(ch)) return false;
//             if(map.get(ch)==0) return false;
//             map.put(ch,map.get(ch)-1);

//         }
//         return true;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna