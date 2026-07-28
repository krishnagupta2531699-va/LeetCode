class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] c=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             int need=target-nums[i];
             if(map.containsKey(need)){
                c[0]=map.get(need);
                c[1]=i;
                return c;
             }
             map.put(nums[i],i);
        }
        return c;
    }
}




// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] s=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                          s[0]=i;
//                          s[1]=j;
//                 }
//             }
//         }
//         return s;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna