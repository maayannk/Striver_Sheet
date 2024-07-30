
class Solution {
    public ListNode findnode(ListNode head , int k){
        int cnt =1;
        ListNode temp =head;
        while(temp!=null){
            if(cnt==k) return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null || k==0) return head;
       ListNode tail=head;
       int length=1;
       while(tail.next!=null){
        length++;
        tail=tail.next;
       }
       if(k%length==0) return head;
       k=k%length;
       tail.next=head;
       ListNode temp = findnode(head,length-k);
       head=temp.next;
       temp.next=null;
       return head;


    }
}