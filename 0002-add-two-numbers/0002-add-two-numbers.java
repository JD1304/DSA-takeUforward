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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head node to simplify logic
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Loop through both lists
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from l1 and l2, or 0 if null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Sum and calculate new carry
            int sum = x + y + carry;
            carry = sum / 10;

            // Create new node with the digit
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the next of dummy as the actual head
        return dummy.next;
    }
}
