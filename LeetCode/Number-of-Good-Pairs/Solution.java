1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        for (int i = 0; i < n; i++) {
6            for (int j = i + 1; j < n; j++) {
7
8                if (nums[i]==nums[j]) {
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15}