
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postorder(root,list);
        return list;
    }
    public void  postorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        postorder(root.left,list);
        postorder(root.right,list);
        list.add(root.val);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna