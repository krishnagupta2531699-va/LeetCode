class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> arr = new ArrayList<>();

        int fr = 0, fc = 0;
        int lr = matrix.length - 1;
        int lc = matrix[0].length - 1;

        while(fr <= lr && fc <= lc) {

           
            for(int i = fc; i <= lc; i++) {
                arr.add(matrix[fr][i]);
            }
            fr++;

            for(int i = fr; i <= lr; i++) {
                arr.add(matrix[i][lc]);
            }
            lc--;

          
            if(fr <= lr) {
                for(int i = lc; i >= fc; i--) {
                    arr.add(matrix[lr][i]);
                }
                lr--;
            }

           
            if(fc <= lc) {
                for(int i = lr; i >= fr; i--) {
                    arr.add(matrix[i][fc]);
                }
                fc++;
            }
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna