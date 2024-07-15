// class Node
// {
// 	int data;
// 	Node next;
// 	Node prev;
// 	Node(int data)
// 	{
// 	    this.data = data;
// 	    next = prev = null;
// 	}

// }

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
	  Node temp = head_ref;
	  int idx=1;
	  Node first = new Node(data);
	  while(temp!=null){
	      if(idx==pos+1){
	          first.prev=temp;
	          first.next=temp.next;
	          temp.next=first;
	      }
	      idx++;
	      temp=temp.next;
	  }
	}
}