class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){ 
             if(i%3==0 && i%5==0) list.add("FizzBuzz");
            else if(i%3==0) list.add("Fizz");
            else if(i%5==0) list.add("Buzz");
            else{
                String s=Integer.toString(i);
                list.add(s);
            }

        }
      return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna