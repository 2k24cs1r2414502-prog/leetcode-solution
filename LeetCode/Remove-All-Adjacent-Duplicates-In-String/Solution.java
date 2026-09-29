1class Solution {
2    public String removeDuplicates(String s) {
3        int n = s.length();
4        Stack<Character> st = new Stack<>();
5        for(int i = 0; i < n; i++) {
6            char ch = s.charAt(i);
7            if(!st.isEmpty() && st.peek() == ch) {
8                st.pop();
9            } else {
10                st.push(ch);
11            }
12        }
13        StringBuilder sb = new StringBuilder();
14        for(char ch : st) {
15            sb.append(ch);
16        }
17        return sb.toString();
18    }
19}