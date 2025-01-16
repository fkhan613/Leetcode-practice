/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //define a new linked list to hold the merged list
        ListNode merged = new ListNode(0);
        ListNode currentNode = merged; 
        
        while(list1 != null && list2 != null){

            //check which node is smaller, and add it respectfully
            if(list1.val <= list2.val){
                currentNode.next = list1;
                list1 = list1.next;

            } else{
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;

        }

        currentNode.next = (list1 == null) ? (list2) : list1;

        return merged.next;
        
    }
}