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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        ListNode temp = list1;
        ListNode Demo = list1;
        ListNode head = temp;

        for(int i = 1; i < a; i++)
        {
            temp = temp.next;
        }
        Demo = temp.next;

        temp.next = list2;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        for(int j = a; j < b; j++)
        {
            Demo = Demo.next;
        }

        temp.next = Demo.next;
        Demo.next = null;

        return head;
    }
}