// Last updated: 7/3/2026, 7:35:48 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13
14        ListNode prev=null;
15        ListNode curr = head;
16
17        while(curr!=null){
18            ListNode temp=curr.next;
19            curr.next=prev;
20            prev=curr;
21            curr=temp;
22        }
23
24        return prev;
25        
26    }
27}