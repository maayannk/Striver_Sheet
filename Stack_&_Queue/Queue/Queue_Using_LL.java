
class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode arr = new QueueNode(a);
        if(front==null){
            front=arr;
            rear=arr;
        }else{
            rear.next=arr;
            rear=arr;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        int val = front.data;
        front=front.next;
        return val;
        
	}
}