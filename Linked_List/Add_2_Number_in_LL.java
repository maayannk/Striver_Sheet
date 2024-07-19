class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry =0;
        while(t1!=null || t2!=null){
            int sum = 0;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            sum+=carry;
            int nodeval = sum%10;
            carry = sum/10;
            ListNode cur = new ListNode(nodeval);
            temp.next = cur;
            temp=temp.next;

        }
        if(carry>0){
            ListNode curr1 = new ListNode(carry);
            temp.next=curr1;
        }

        return dummy.next;
        
    }
}