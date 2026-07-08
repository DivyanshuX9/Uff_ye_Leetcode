/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        Set<ListNode> gg=new HashSet<>();
        ListNode slow=head;
        gg.add(slow);
        while(slow!=null){
            slow=slow.next;
            if(gg.contains(slow)) return slow;
            gg.add(slow);
        }
        return null;
    }
}