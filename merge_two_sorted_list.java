/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //Create a dummy listnode.
        ListNode dummy = new ListNode(-1);
        
        ListNode l3 = dummy;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val < l2.val)
            {
                dummy.next = new ListNode(l1.val);
                l1 = l1.next;
                dummy = dummy.next;
            }
            else
            {
                dummy.next = new ListNode(l2.val);
                l2 = l2.next;
                dummy = dummy.next;
            }
        }
        
        while(l1!=null)
        {
            dummy.next = new ListNode(l1.val);
            dummy = dummy.next;
            l1 = l1.next;
        }
        
        while(l2!=null)
        {
            dummy.next = new ListNode(l2.val);
            dummy = dummy.next;
            l2 = l2.next;
        }
        
        return l3.next;
        
    }
}
