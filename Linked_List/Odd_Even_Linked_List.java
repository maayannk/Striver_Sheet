class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            list.add(temp.val);
            temp=temp.next.next;
        }
        // this is for the last element if 
        // temp is at the tail and
        // temp.next=null then the loop ended
        if(temp!=null) list.add(temp.val);
        temp = head.next;
        while(temp!=null && temp.next!=null){
            list.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null) list.add(temp.val);
        
        temp = head;
        int i =0;
        while(temp!=null){
                temp.val = list.get(i);
                i++;
                temp=temp.next;
        }

        return head;

    }
}

// Without Extra Space
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;
        ListNode odd= head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next=evenHead;
        return head;
    }
}

