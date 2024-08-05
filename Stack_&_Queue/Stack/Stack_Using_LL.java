class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode arr = new StackNode(a);
        arr.next=top;
        top=arr;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top!=null) {
            
        int ans = top.data;
        top=top.next;
        return ans;
        }
        
        return -1;
        
    }
}