1class Solution {
2    public String sortSentence(String s) {
3        String[] w = s.split(" ");
4        StringBuilder sb = new StringBuilder();
5
6        for(int i = 1; i <= w.length; i++) {
7            for(String x : w) {
8                if(x.charAt(x.length()-1) - '0' == i) {
9                    sb.append(x.substring(0, x.length()-1)).append(" ");
10                }
11            }
12        }
13
14    return sb.toString().trim();
15
16    }
17}