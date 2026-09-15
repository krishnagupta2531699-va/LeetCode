class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return f(root,targetSum,0);
    }
    public boolean f(TreeNode root,int targetSum,int sum){
         if (root == null) return false;
        sum=sum+root.val;
        if(root.left==null && root.right==null){
             return sum==targetSum;
        }
        return f(root.left,targetSum,sum)|| f(root.right,targetSum,sum);
        
           
        

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna