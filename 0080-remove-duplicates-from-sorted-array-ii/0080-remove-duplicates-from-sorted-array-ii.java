class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 0, j = 1, k = 0;
        int count = 1;

        while (j <nums.length) {

            if (nums[i] == nums[j]) {
                count++;
                j++;
            } else {

                if (count >= 2) {
                    nums[k++] = nums[i];
                    nums[k++] = nums[i];
                } else {
                    nums[k++] = nums[i];
                }

              
                count = 1;
                i = j;
                j = i + 1;
            }
        }
        if (count >= 2) {
                    nums[k++] = nums[i];
                    nums[k++] = nums[i];
                } else {
                    nums[k++] = nums[i];
                }

        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna