1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4        int n = tokens.length;
5
6        for(int i = 0; i < n; i++) {
7
8            if(tokens[i].equals("+")) {
9                int b = st.pop();
10                int a = st.pop();
11                st.push(a + b);
12            }
13
14            else if(tokens[i].equals("-")) {
15                int b = st.pop();
16                int a = st.pop();
17                st.push(a - b);
18            }
19
20            else if(tokens[i].equals("*")) {
21                int b = st.pop();
22                int a = st.pop();
23                st.push(a * b);
24            }
25
26            else if(tokens[i].equals("/")) {
27                int b = st.pop();
28                int a = st.pop();
29                st.push(a / b);
30            }
31
32            else {
33                st.push(Integer.parseInt(tokens[i]));
34            }
35        }
36
37        return st.pop();
38    }
39}