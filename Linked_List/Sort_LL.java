class Solution {
    public ListNode sortList(ListNode head) {
        
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        temp=head;
        int i =0;
        while(temp!=null){
            temp.val = l.get(i);
            i++;
            temp=temp.next;
        }

        return head;
    }
}