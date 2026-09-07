class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int ele : map.keySet()) {
            if (map.get(ele) == 1) {
                return ele;
            }
        }

        return 0;
    }
}




// class Solution {
//     public int singleNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i+=3){
//             if(nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return nums[nums.length-1];
        
//     }
   
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna