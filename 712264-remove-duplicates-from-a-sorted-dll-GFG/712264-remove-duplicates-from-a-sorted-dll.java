/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        Node dum=new Node(-1);
        Node t=dum;
        Node c=headRef;
        while(c!=null){
            if(t.data!=c.data){
                t.next=c;
                c.prev=t;
                t=c;
                c=c.next;
            }
            else{
                c=c.next;
            }
        }
        t.next=null;
        return dum.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna