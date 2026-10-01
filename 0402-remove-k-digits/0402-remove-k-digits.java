class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        while (j < num.length()) {
            int digit = num.charAt(j) - '0';

            while (stack.size() != 0 &&
                   k != 0 &&
                   stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
            j++;
        }

        while (k != 0) {
            stack.pop();
            k--;
        }

        StringBuilder m = new StringBuilder();

        while (stack.size() != 0) {
            m.append(stack.pop());
        }

        m.reverse();

        int i = 0;

        while (i < m.length() - 1 && m.charAt(i) == '0') {
            i++;
        }
        if (m.length() == 0) {
            return "0";
        }

        return m.substring(i);
    }
}


















// class Solution {
//     public String removeKdigits(String num, int k) {
//         Stack<Integer> stack = new Stack<>();
//         int j = 0;

//         while (j < num.length()) {
//             char ch = num.charAt(j);
//             int digit = Integer.parseInt(String.valueOf(ch));

//             if (stack.size() == 0) {
//                 stack.push(digit);
//             }
//             else if (k != 0) {

//                 while (stack.size() != 0 &&
//                        k != 0 &&
//                        stack.peek() > digit) {

//                     stack.pop();
//                     k--;
//                 }

//                 stack.push(digit);
//             }
//             else {
//                 stack.push(digit);
//             }

//             j++;
//         }

//         while (k != 0 && stack.size() != 0) {
//             stack.pop();
//             k--;
//         }

//         StringBuilder m = new StringBuilder();

//         while (stack.size() != 0) {
//             m.append(stack.pop());
//         }

//         m.reverse();

//         if (m.length() == 0) {
//             return "0";
//         }

//         int i = 0;
//         StringBuilder z = new StringBuilder();

//         while (i < m.length() && m.charAt(i) == '0') {
//             i++;
//         }

//         while (i < m.length()) {
//             z.append(m.charAt(i));
//             i++;
//         }

//         if (z.length() == 0) {
//             return "0";
//         }

//         return z.toString();
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna