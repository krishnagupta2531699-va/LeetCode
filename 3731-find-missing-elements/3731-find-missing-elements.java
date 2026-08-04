class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
           set.add(num);
           min=Math.min(min,num);
           max=Math.max(max,num);
 
       }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
      
      return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna