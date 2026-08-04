class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
         int count=0;
        int max=1;
        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
               

            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int ele:map.keySet()){
          
            if(map.get(ele)>max){
               max=map.get(ele);
               count=max;
            }
            else if(map.get(ele)==max){
                max=map.get(ele);
                count=count+max;
            }
           
        }
        return count;
       
         
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna