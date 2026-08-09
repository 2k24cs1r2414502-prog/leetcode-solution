1class Solution {
2    public int differenceOfSum(int[] nums) {
3        int n = nums.length;
4        int sum1 = 0;
5        int sum2 = 0;
6
7        for (int i = 0; i < n; i++) {
8            sum1 = sum1 + nums[i];
9
10            int x = nums[i];  
11
12            while (x > 0) {
13                int rem = x % 10;
14                sum2 = sum2 + rem;
15                x = x / 10;
16            }
17        }
18
19        int ans = Math.abs(sum1 - sum2);
20        return ans;
21    }
22}