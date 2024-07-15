// class Node
// {
//     int data;
//     Node next;
//     Node prev;
//     Node(int x){
//         data = x;
//         next = null;
//         prev = null;
//     }
// }


class Solution {
    public Node deleteNode(Node head, int x) {
        if(head==null){
            return null;
        }
        if(x==1){
            return head.next;
        }
        Node temp = head;
        for(int i =1 ; i<x-1 ; i++){
            temp=temp.next;
        } 
        if(temp==null || temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
        
        return head;
    }
}