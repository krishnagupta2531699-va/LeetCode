/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                Node e=temp;
                Node t=temp.next;
                e.next=e.child;
                e.child.prev=e;
                e.child=null;
                Node z=e.next;
                while(z.next!=null){
                    z=z.next;
                }
                z.next=t;

                if(t!=null)t.prev=z;
            }
            temp=temp.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna