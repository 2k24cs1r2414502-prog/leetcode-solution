1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16        ListNode temp=head;
17
18
19        while(fast!=null && fast.next!=null){
20            slow=slow.next;
21            fast=fast.next.next;
22            if(slow==fast){
23                break;
24            }
25        }
26        if(fast == null || fast.next == null) return null;
27        while(temp!=slow){
28            temp=temp.next;
29            slow=slow.next;
30        }
31        return temp;
32    }
33}