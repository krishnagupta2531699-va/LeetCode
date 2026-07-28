class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}


// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         int[] freq=new int[256];
//         int count=0;
//         for(int i=0;i<jewels.length();i++){
//             freq[jewels.charAt(i)]=1;
//         }
//         for(int i=0;i<stones.length();i++){
//            if(freq[stones.charAt(i)]==1){
//             count++;
//            }
           
//         }
//         return count;
//     }
// }



// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         HashSet<Character> set=new HashSet<>();
//         int count=0;
//         for(int i=0;i<jewels.length();i++){
//             set.add(jewels.charAt(i));
//         }
//         for(int i=0;i<stones.length();i++){
//             if(set.contains(stones.charAt(i))) count++;
//         }
//         return count;
//     }
// }




// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna