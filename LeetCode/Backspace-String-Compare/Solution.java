1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3
4        Stack<Character> ss = new Stack<>();
5        Stack<Character> tt = new Stack<>();
6
7        for(int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9
10            if(ch == '#') {
11                if(!ss.isEmpty())
12                    ss.pop();
13            } else {
14                ss.push(ch);
15            }
16        }
17
18        for(int i = 0; i < t.length(); i++) {
19            char ch = t.charAt(i);
20
21            if(ch == '#') {
22                if(!tt.isEmpty())
23                    tt.pop();
24            } else {
25                tt.push(ch);
26            }
27        }
28
29        return ss.equals(tt);
30    }
31}