class MyQueue {
    Stack<Integer> MyQueue;
    Stack<Integer> q=new Stack<>();

    public MyQueue() {
        MyQueue=new Stack<>();
    }
    
    public void push(int x) {
        MyQueue.push(x);
    }
    
    public int pop() { 
         while(MyQueue.size()!=1){
            q.push(MyQueue.pop());
        }
        int z= MyQueue.pop();
        while(q.size()!=0){
            MyQueue.push(q.pop());
        }
        return z;  
    }
    
    public int peek() {
        while(MyQueue.size()!=1){
            q.push(MyQueue.pop());
        }
        int z= MyQueue.peek();
         while(q.size()!=0){
            MyQueue.push(q.pop());
        } 
        return z;
    }
    
    public boolean empty() {
        return MyQueue.size()==0;

    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna