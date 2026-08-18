class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=n/2;
        int count=1;
        int i=0,j=i+1;
        int ans=nums[0];
        while(j<n){
           if(nums[i]==nums[j]){
              count++;
               j++;

           }
           else{
              
              if(count>max){
                 ans=nums[i];
                 return ans;
              }
              i=j;
              count=1;
              j++;
           }

        }
        if(count>max){
            ans=nums[i];
        }

        return ans;

           
    }
}




// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i]) + 1);
//             }
//             else{
//                 map.put(nums[i],1);
//             }
//         }
       
//        int max = 0;
//         int answer = 0;

//         for (int ele : map.keySet()) {
//             if (map.get(ele) > max) {
//                 max = map.get(ele);
//                 answer = ele;
//             }
//         }
//         return answer;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna