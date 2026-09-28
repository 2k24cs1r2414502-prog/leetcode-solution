1class Solution {
2    public void reverseString(char[] s) {
3        StringBuilder sb = new StringBuilder(new String(s));
4        sb.reverse();
5
6        for(int i = 0; i < s.length; i++) {
7            s[i] = sb.charAt(i);
8        }
9        
10    }
11}