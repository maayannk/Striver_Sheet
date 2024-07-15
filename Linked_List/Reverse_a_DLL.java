// class Node
// {
//     int data;
//     Node next, prev;
//     Node(int data)
//     {
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }
// }

public static Node reverseDLL(Node  head)
{
    //Your code here
    Stack<Integer> st = new Stack<>();
    Node temp = head;
    while(temp!=null){
        st.push(temp.data);
        temp=temp.next;
    }
    temp=head;
    while(temp!=null){
        temp.data=st.pop();
        temp=temp.next;
    }
    
    return head;
}