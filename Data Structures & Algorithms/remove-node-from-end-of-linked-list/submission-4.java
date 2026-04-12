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
//1 2 3 4 5 6

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }

        int N = count - n;
        if(N == 0) return head.next;
        curr = head;
        for(int i = 0; i < count ; i++){
            if(i == N - 1){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;

        }

        return head;
    }
}
