1class Solution {
2    public char findTheDifference(String s, String t) {
3        int sum=0,sum1=0;
4        char[] nums=s.toCharArray();
5        char[] nums1=t.toCharArray();
6        for(int i=0;i<nums.length;i++){
7            sum+=nums[i];
8            
9        }
10        for(int j=0;j<nums1.length;j++){
11            sum1+=nums1[j];
12            
13        }
14        int n=sum1-sum;
15        return (char)n;
16    }
17}