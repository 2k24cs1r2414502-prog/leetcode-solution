1class Solution {
2public:
3    ListNode *detectCycle(ListNode *head) {
4        ListNode* slow = head;
5        ListNode* fast = head;
6        while (fast && fast->next) {
7            slow = slow->next;
8            fast = fast->next->next;
9            if (slow == fast) break;     
10        }
11        if (fast == NULL || fast->next == NULL)return NULL;
12        slow = head;
13        while (slow != fast) {
14            slow = slow->next;
15            fast = fast->next;
16        }
17        return slow;
18    }
19};