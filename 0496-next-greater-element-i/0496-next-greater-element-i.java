class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        int k = 0;

        int n = nums1.length - 1;

        while (n >= 0) {

            Stack<Integer> stack = new Stack<>();

            int j = nums2.length - 1;

            while (j >= 0 && nums2[j] != nums1[n]) {
                stack.push(nums2[j]);
                j--;
            }

            while (stack.size() != 0 && nums1[n] >= stack.peek()) {
                stack.pop();
            }

            if (stack.size() == 0) {
                arr[k] = -1;
            }
            else {
                arr[k] = stack.peek();
            }

            k++;
            n--;
        }

        int i = 0;
        int z = arr.length - 1;

        while (i < z) {
            int temp = arr[i];
            arr[i] = arr[z];
            arr[z] = temp;

            i++;
            z--;
        }

        return arr;
    }
}






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