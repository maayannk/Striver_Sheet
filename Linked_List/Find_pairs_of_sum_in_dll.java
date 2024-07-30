class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            Node temp1=temp.next;
            while(temp1!=null && temp.data+temp1.data<=target){
                ArrayList<Integer> l = new ArrayList<>();
                if(temp.data+temp1.data==target){
                    l.add(temp.data);
                    l.add(temp1.data);
                    list.add(l);
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return list;
    }
}

                <-- Optimal -->
class Solution {
    static Node findtail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        Node left = head;
        Node right = findtail(head); 
        while(left.data < right.data){
            ArrayList<Integer> list = new ArrayList<>();
            if(left.data+right.data==target){
                list.add(left.data);
                list.add(right.data);
                l.add(list);
                left=left.next;
                right=right.prev;
            }else if(left.data+right.data >target){
                right=right.prev;
            }else{
                left=left.next;
            }
        } 
        return l;
    }
}
      