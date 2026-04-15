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

 //1 2 3 4 5 6 7 -> 1 2 5 4 3 6 7 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp = result;

        for(int i = 1 ; i < left ; i++){
            temp = temp.next;
            //navigates till start of sublist that needs to be reversed
        }

        // start of sublist that needs to be reversed
        ListNode startNode = temp.next;
        // end of sublist that needs to be reversed
        ListNode endNode = startNode;

        for(int i = 0 ; i < right - left ; i++){
            endNode = endNode.next;
        }
        //nodes after the reverse sublist
        ListNode remaning = endNode.next;
        //setting null before reversing
        endNode.next = null;
        //temp is before the reverse start.
        //hence from next element reverse
        temp.next = reverse(startNode);
        //after reverse, startNode is at end.
        //so next element attach to remaning
        startNode.next = remaning;

        return result.next;
       
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}