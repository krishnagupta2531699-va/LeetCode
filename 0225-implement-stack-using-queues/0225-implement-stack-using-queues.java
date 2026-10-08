class MyStack {
    Queue<Integer> MyStack;
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        MyStack = new LinkedList<>();
    }

    public void push(int x) {
        MyStack.add(x);
    }

    public int pop() {
        while (MyStack.size() != 1) {
            q.add(MyStack.remove());
        }

        int z = MyStack.remove();

        while (q.size() != 0) {
            MyStack.add(q.remove());
        }

        return z;
    }

    public int top() {
        while (MyStack.size() != 1) {
            q.add(MyStack.remove());
        }

        int z = MyStack.peek();

     
        q.add(MyStack.remove());

       
        while (q.size() != 1) {
            MyStack.add(q.remove());
        }

      
        MyStack.add(q.remove());

        return z;
    }

    public boolean empty() {
        return MyStack.size() == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna