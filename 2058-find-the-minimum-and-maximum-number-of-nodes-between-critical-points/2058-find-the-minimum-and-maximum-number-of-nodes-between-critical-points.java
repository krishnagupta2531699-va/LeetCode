
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp=head;
        int size=0;
        int[] arr1={-1,-1};
        while(temp!=null){
            size++;
            temp=temp.next;
        }
       
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode i=head;
        ListNode j=i.next;
        ListNode k=j.next;
        int l=1;
        while(k!=null){
            if(j.val>i.val && j.val>k.val){
                arr.add(l);
            }
            else if(j.val<i.val && j.val<k.val){
                arr.add(l);
            }
            l++;
            i=i.next;
            j=j.next;
            k=k.next;
        }
        
     
        if(arr.size() < 2){
            return arr1;
        }

        int min = Integer.MAX_VALUE;
        for(int x = 1; x < arr.size(); x++){
            min = Math.min(min, arr.get(x) - arr.get(x-1));
        }

        int max = arr.get(arr.size()-1) - arr.get(0);

        arr1[0] = min;
        arr1[1] = max;

        return arr1;

      

    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna