class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                }
                Node   newnode = temp.next;
              Node  prevnode =temp.prev;
                if(newnode!=null) newnode.prev=prevnode;
                if(prevnode!=null) prevnode.next=newnode;
                temp=newnode;
            }else{
                temp=temp.next;
            }
        }
        
        return head;
        
    }
}