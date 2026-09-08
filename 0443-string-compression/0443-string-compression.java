class Solution {
    public int compress(char[] chars) {

        StringBuilder m = new StringBuilder();

        int i = 0;
        int j = i + 1;
        int count = 1;

        while (j < chars.length) {

            if (chars[i] == chars[j]) {
                count++;
            }
            else {
                m.append(chars[i]);

                if (count > 1) {
                    m.append(count);
                }

                count = 1;
                i = j;
            }

            j++;
        }

    
        m.append(chars[i]);

        if (count > 1) {
            m.append(count);
        }

  
        for (int k = 0; k < m.length(); k++) {
            chars[k] = m.charAt(k);
        }

        return m.length();
    }
}













// class Solution {
//     public int compress(char[] chars) {
//         int i=0;
//         int j=i+1;
//         int count=1;
//         String m="";
//         while(j<chars.length){
//             if(chars[i]==chars[j]){
//                 count++;
//             }
//             else{
//                 m+=chars[i];
                
//                 if(count>1)m+=count;
//                 count=1;
//                 i=j;

                

//             }
//             j++;
//         }
//         m+=chars[i];
//         if(count>1) m+=count;
//         for(int k=0;k<m.length();k++){
//             chars[k]=m.charAt(k);
//         }
//         return m.length();
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna