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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode curr=head;
14        for(int i=1;i<k;i++){
15            curr=curr.next;
16        }
17        ListNode a=curr;
18        ListNode b=head;
19        while(curr!=null && curr.next!=null){
20            curr=curr.next;
21            b=b.next;
22        }
23        int temp=a.val;
24        a.val=b.val;
25        b.val=temp;
26        return head;
27    }
28}