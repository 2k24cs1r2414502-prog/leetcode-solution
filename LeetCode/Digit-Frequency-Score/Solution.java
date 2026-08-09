1class Solution {
2    public int digitFrequencyScore(int n) {
3        int sum=0;
4        int rem;
5        while(n>0){
6            rem=n%10;
7            sum=sum+rem;
8            n=n/10;
9
10        }
11        return sum;
12
13
14    }
15}