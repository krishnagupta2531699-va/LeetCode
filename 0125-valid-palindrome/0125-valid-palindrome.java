// class Solution {
//     public boolean isPalindrome(String s) {
//             s=s.toLowerCase();
//             int i=0,j=s.length()-1;
//          while(i<=j){
//             if (!Character.isLetterOrDigit(s.charAt(i))) {
//                              i++;
//                              continue;
//                              } 
//             if(!Character.isLetterOrDigit(s.charAt(j))) {
//                              j--;
//                              continue;
//                 } 
//              if(s.charAt(i)!=s.charAt(j)){
//                       return false;   
                             
//                  }
                 
//                          i++;
//                          j--; 
                 
                
                
//          }
//          return true;
//     }
   
// }







class Solution {
    public boolean isPalindrome(String s) {
          
            int i=0,j=s.length()-1;
         while(i<j){
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                             i++;
                             continue;
                             } 
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                             j--;
                             continue;
                } 
             if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }
                 
                         i++;
                         j--; 
                 
                
                
         }
         return true;
    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna