// With extra space
class Solution
{
    static int countNodesinLoop(Node head)
    {
       HashMap<Node,Integer> mp = new HashMap<>();
       Node temp = head;
       int count =0;
       while(temp!=null){
           if(mp.containsKey(temp)){
               return count-mp.get(temp);
           }
           mp.put(temp,count);
           temp=temp.next;
           count++;
       }
       
       return 0;
    }
}

// WithOut extra Space

class Solution
{
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(slow!=null &&fast!=null && fast.next!=null){
            // check the cycle
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int count =1;
                slow=slow.next;
                while(slow!=fast){
                    count++;
                    slow=slow.next;
                }
                return count;
            }
        }
        
        return 0;
    }

}