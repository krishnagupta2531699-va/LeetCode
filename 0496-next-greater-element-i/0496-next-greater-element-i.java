class Solution {
    public class Pair{
        int val;
        int next;
        Pair(int val,int next){
            this.val=val;
            this.next=next;
        }
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Pair> x=new ArrayList<>();
        Stack<Pair> stack=new Stack<>();
        int n=nums2.length-1;
        stack.push(new Pair(nums2[n],-1));
        x.add(new Pair(nums2[n],-1));
        int j=n-1;
        while(j>=0){
            if(nums2[j]<stack.peek().val){
               int next=stack.peek().val;
               stack.push(new Pair(nums2[j],next));
                x.add(new Pair(nums2[j],next));
            }
            else if(nums2[j]>=stack.peek().val){
                
                while(stack.size()!=0 && nums2[j]>=stack.peek().val){
                    
                    stack.pop();
                    
                }
                if(stack.size()==0){
                    stack.push(new Pair(nums2[j],-1));
                    x.add(new Pair(nums2[j], -1));
                }
                else{
                     int next=stack.peek().val;
                     stack.push(new Pair(nums2[j],next));
                     x.add(new Pair(nums2[j], next));
                }
            }
            j--;
        }
      

      int[] ans=new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
        for(int k=0;k<x.size();k++){
            if(nums1[i]==x.get(k).val){
                ans[i]=x.get(k).next;
                break;
            }
        }
      }
       return ans;
    }
}





















// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//         int[] arr = new int[nums1.length];
//         int k = 0;

//         int n = nums1.length - 1;

//         while (n >= 0) {

//             Stack<Integer> stack = new Stack<>();

//             int j = nums2.length - 1;

//             while (j >= 0 && nums2[j] != nums1[n]) {
//                 stack.push(nums2[j]);
//                 j--;
//             }

//             while (stack.size() != 0 && nums1[n] >= stack.peek()) {
//                 stack.pop();
//             }

//             if (stack.size() == 0) {
//                 arr[k] = -1;
//             }
//             else {
//                 arr[k] = stack.peek();
//             }

//             k++;
//             n--;
//         }

//         int i = 0;
//         int z = arr.length - 1;

//         while (i < z) {
//             int temp = arr[i];
//             arr[i] = arr[z];
//             arr[z] = temp;

//             i++;
//             z--;
//         }

//         return arr;
//     }
// }






// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//         int[] arr = new int[nums1.length];
//         int k = 0;

//         Stack<Integer> stack = new Stack<>();

//         int j = nums2.length - 1;

    
//         while (j >= 0) {
//             stack.push(nums2[j]);
//             j--;
//         }

//         int n = nums1.length - 1;

//         arr[k] = -1;
//         k++;

//         j = n - 1;

//         while (j >= 0) {

//             while (stack.size() != 0 && nums1[j] >= stack.peek()) {
//                 stack.pop();
//             }

//             if (stack.size() == 0) {
//                 arr[k] = -1;
//             }
//             else {
//                 arr[k] = stack.peek();
//             }

//             k++;
//             stack.push(nums1[j]);

//             j--;
//         }

//         int i = 0;
//         int z = arr.length - 1;

//         while (i < z) {
//             int temp = arr[i];
//             arr[i] = arr[z];
//             arr[z] = temp;

//             i++;
//             z--;
//         }

//         return arr;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna