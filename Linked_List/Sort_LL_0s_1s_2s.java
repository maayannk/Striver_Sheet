class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        List<Integer> l = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            l.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(l);
        temp=head;
        int i =0;
        while(temp!=null){
            temp.data = l.get(i);
            i++;
            temp=temp.next;
        }
        
        return head;
    }
}