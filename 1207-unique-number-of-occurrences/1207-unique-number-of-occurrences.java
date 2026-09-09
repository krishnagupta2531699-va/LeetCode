class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
           else map.put(arr[i],1);
        }
       HashSet<Integer> set=new HashSet<>();
       for(int ele:map.keySet()){
          if(!set.contains(map.get(ele))){
            set.add(map.get(ele));
          }
          else{
            return false;
          }
       }
       return true;
    }
}




// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//         Arrays.sort(arr);
//         ArrayList<Integer> x=new ArrayList<>();
//         int i=0;
//         int j=i+1;
//         int count=1;
//         while(j<arr.length){
//             if(arr[i]==arr[j]){
//                 count++;

//             }
//             else{
//                 x.add(count);
//                 count=1;
//                 i=j;
//             }
//             j++;
//         }
//         x.add(count);
//         for (i = 0; i < x.size(); i++) {
//             for (j = i + 1; j < x.size(); j++) {

//                 if (x.get(i).equals(x.get(j))) {
//                     return false;
//                 }
//             }
//         }
//         return true;
       

//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna