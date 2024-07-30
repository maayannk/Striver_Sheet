class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        Node temp = head;
        Node temp1= null;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp1=temp;
                temp=temp.next;
                temp.prev=temp1;
            }
        }
        
        return head;
    }
}