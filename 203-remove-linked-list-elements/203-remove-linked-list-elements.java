class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null) return head;
        
        while(head!=null && head.val == val) head = head.next;
        
        ListNode temp = head, prev = null;
        
        while(temp!=null){
            
            if(temp.val == val)
                prev.next = temp.next;
            else
                prev = temp;
            
            temp = temp.next;
        }
        return head;
    }
}