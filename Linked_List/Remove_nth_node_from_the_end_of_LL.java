class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
      // this statement means a lot ******
       if(length-n == 0) return head.next;
        int i =1;
        while(i<length-n){
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;


    }
}