class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (stack1.size() == 0 && ch != '#') {
                stack1.push(ch);
            }
            else if (ch == '#' && stack1.size() > 0) {
                stack1.pop();
            }
            else if (ch != '#') {
                stack1.push(ch);
            }

            i++;
        }

        int j = 0;

        while (j < t.length()) {
            char ch = t.charAt(j);

            if (stack2.size() == 0 && ch != '#') {
                stack2.push(ch);
            }
            else if (ch == '#' && stack2.size() > 0) {
                stack2.pop();
            }
            else if (ch != '#') {
                stack2.push(ch);
            }

            j++;
        }

        while (stack1.size() > 0 && stack2.size() > 0) {
            char x = stack1.pop();
            char y = stack2.pop();

            if (x != y) {
                return false;
            }
        }

        if (stack1.size() > 0 || stack2.size() > 0) {
            return false;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna